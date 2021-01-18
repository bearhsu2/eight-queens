package org.example;


import org.junit.Assert;
import org.junit.Test;

public class QueensTest {


    @Test
    public void eight_queens_should_have_92_solutions() {

        Queens queens = new Queens(8);

        queens.execute();

        Assert.assertEquals(92, queens.getSolutions());
    }
}