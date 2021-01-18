package org.example;

public class Checker {
    public Checker() {
    }


    boolean isLegal(int[] q, int k) {
        for (int i = 0; i < k; i++) {
            if (q[i] == q[k]) return false;   // |
            if ((q[i] - q[k]) == (k - i)) return false;   // \
            if ((q[k] - q[i]) == (k - i)) return false;   // /
        }
        return true;
    }
}