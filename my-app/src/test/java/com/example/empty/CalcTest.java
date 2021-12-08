package com.example.empty;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
    private Calc mcalc;

    @Test
    public void testDiv() {

    }

    @Test
    public void testPlus() {
        mcalc = new Calc();
        assertEquals(3, mcalc.plus(1, 2), 0);
    }
}
