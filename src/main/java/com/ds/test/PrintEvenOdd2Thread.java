package com.ds.test;

public class PrintEvenOdd2Thread {
    int counter = 1;
    static int N;

    public void printOddNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {

                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.println(counter + " ");
                counter++;
                // Notify to second thread
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (counter < N) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //print even number
                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        N = 10;
        PrintEvenOdd2Thread obj = new PrintEvenOdd2Thread();

        Thread t1 = new Thread(() -> obj.printEvenNumber());

        Thread t2 = new Thread(() -> obj.printOddNumber());

        t1.start();
        t2.start();
    }
}
