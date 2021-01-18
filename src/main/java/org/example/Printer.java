package org.example;

public class Printer {
    public Printer() {
    }


    void print(int[] q) {
        int n = q.length;
        for (int k : q) {
            for (int j = 0; j < n; j++) {
                System.out.print(k == j ? "Q" : ".");
            }
            System.out.println();
        }
        System.out.println();
    }
}