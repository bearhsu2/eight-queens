package org.example;

public class Queens {

    private final int numQueens;


    public Queens(int numQueens) {
        this.numQueens = numQueens;
    }


    public static void main(String[] args) {
        new Queens(8).execute();
    }


    private void execute() {
        doExecute(new int[numQueens], 0);
    }


    private void doExecute(int[] q, int k) {
        int n = q.length;
        if (k == n) {
            print(q);
        } else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (isLegal(q, k)) {
                    doExecute(q, k + 1);
                }
            }
        }
    }


    private boolean isLegal(int[] q, int k) {
        for (int i = 0; i < k; i++) {
            if (q[i] == q[k]) return false;   // |
            if ((q[i] - q[k]) == (k - i)) return false;   // \
            if ((q[k] - q[i]) == (k - i)) return false;   // /
        }
        return true;
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


}

