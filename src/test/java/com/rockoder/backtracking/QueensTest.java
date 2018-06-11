package com.rockoder.backtracking;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueensTest {

    @Test
    public void given1x1Board_thenReturn1Results() {
        Queens.enumerate(1);
        assertEquals(1, Queens.getnSolutions());
    }

    @Test
    public void given3x3Board_thenReturn0Results() {
        Queens.enumerate(3);
        assertEquals(0, Queens.getnSolutions());
    }

    @Test
    public void given4x4Board_thenReturn2Results() {
        Queens.enumerate(4);
        assertEquals(2, Queens.getnSolutions());
    }

    @Test
    public void given8x8Board_thenReturn8Results() {
        Queens.enumerate(8);
        assertEquals(8, Queens.getnSolutions());
    }
}
