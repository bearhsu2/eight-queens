package org.example;

public class Queens {

    private int n;


    public Queens(int n) {
        this.n = n;
    }


    public static void main(String[] args) {
        new Queens(8).enumerate();
    }


    private void enumerate() {
        enumerate(new int[n], 0);
    }


    private void print(int[] q) {
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


    private void enumerate(int[] q, int k) {
        int n = q.length;
        if (k == n) {
            print(q);
        } else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (isLegal(q, k)) {
                    enumerate(q, k + 1);
                }
            }
        }
    }


    private boolean isLegal(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n]) return false;   // same column
            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
        }
        return true;
    }
}

