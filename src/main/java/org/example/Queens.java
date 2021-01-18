package org.example;

public class Queens {

    private final int numQueens;
    public int[] arrangement;
    private int solutions;


    public Queens(int numQueens) {
        this.numQueens = numQueens;
        arrangement = new int[numQueens];
    }


    public static void main(String[] args) {
        Queens queens = new Queens(8);
        queens.execute();
        System.out.println(queens.getSolutions());
    }


    public int getSolutions() {
        return solutions;
    }


    public void execute() {
        doExecute(0);
    }


    private void doExecute(int k) {
        int n = arrangement.length;
        if (k == n) {
            solutions++;
            print(arrangement);
        } else {
            for (int i = 0; i < n; i++) {
                arrangement[k] = i;
                if (isLegal(arrangement, k)) {
                    doExecute(k + 1);
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

