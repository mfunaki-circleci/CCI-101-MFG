package com.example.empty;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
    private Calc mcalc;

    @Test
    public void testDiv() {
        mcalc = new Calc();
        assertEquals(2, mcalc.div(2, 1));
        assertEquals(0, mcalc.div(0, 1));
    }

    @Test
    public void testPlus() {
        mcalc = new Calc();
        assertEquals(3, mcalc.plus(1, 2));
    }
}
