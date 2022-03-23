package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
            int a = 1;
            int b = 1;
            int c = 1;
            int x = 1;
            int expected = 3;
            int rsl = X2.calc(a, b, c, x);
            Assert.assertEquals(expected, rsl);
        }

    @Test
    public void whenE0F1G1H1Then2() {
            int e = 0;
            int f = 1;
            int g = 1;
            int h = 1;
            int expected = 2;
            int rsl1 = X2.calc(e, f, g, h);
            Assert.assertEquals(expected, rsl1);
    }

    @Test
    public void whenI1J1K0L1Then2() {
            int i = 1;
            int j = 1;
            int k = 0;
            int l = 1;
            int expected = 2;
            int rsl2 = X2.calc(i, j, k, l);
            Assert.assertEquals(expected, rsl2);
    }

    @Test
    public void whenM1N1O0P1Then2() {
            int m = 1;
            int n = 1;
            int o = 0;
            int p = 1;
            int expected = 2;
            int rsl3 = X2.calc(m, n, o, p);
            Assert.assertEquals(expected, rsl3);
    }
}