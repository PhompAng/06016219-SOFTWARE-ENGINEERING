package com.company.Lucas;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public class LucasTest {
    private static Lucas lucas;

    @BeforeClass
    public static void setUp() {
        lucas = new Lucas();
    }

    @Test
    public void testZero() {
        assertEquals(2, lucas.getLucas(0));
    }

    @Test
    public void testOne() {
        assertEquals(1, lucas.getLucas(1));
    }

    @Test
    public void testFour() {
        assertEquals(7, lucas.getLucas(4));
    }

    @Test
    public void testFifteen() {
        assertEquals(1364, lucas.getLucas(15));
    }
}
