package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
            short in = 182;
            double expected = 94.3;
            double out = Fit.manWeight(in);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void womanWeight() {
            short in = 175;
            double expected = 74.75;
            double out = Fit.womanWeight(in);
            Assert.assertEquals(expected, out, 0.01);
    }
}