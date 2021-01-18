package org.example;

public class Queens {


    public static void main(String[] args) {
        int[] answer = new int[8];
        new Queens().enumerate(answer, 0);
    }


    public void print(int[] q) {
        int n = q.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (q[i] == j) System.out.print("Q ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void enumerate(int[] q, int k) {
        int n = q.length;
        if (k == n) print(q);
        else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (new Queens().isLegal(q, k)) new Queens().enumerate(q, k + 1);
            }
        }
    }


    public boolean isLegal(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n]) return false;   // same column
            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
        }
        return true;
    }
}

