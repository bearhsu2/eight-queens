package org.example;

public class Queens {

    public final int[] arrangement;
    private final Checker checker = new Checker();
    private int numSolutions;


    public Queens(int n) {
        arrangement = new int[n];
    }


    public static void main(String[] args) {
        Queens queens = new Queens(8);
        queens.execute();
        System.out.println(queens.getNumSolutions());
    }


    public int getNumSolutions() {
        return numSolutions;
    }


    public void execute() {
        doExecute(0);
    }


    private void doExecute(int k) {
        int n = arrangement.length;
        if (k == n) {
            numSolutions++;
            print(arrangement);
        } else {
            for (int i = 0; i < n; i++) {
                arrangement[k] = i;
                if (checker.isLegal(arrangement, k)) {
                    doExecute(k + 1);
                }
            }
        }
    }


    private void print(int[] q) {
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

