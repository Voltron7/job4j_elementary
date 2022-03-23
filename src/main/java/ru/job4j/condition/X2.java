package ru.job4j.condition;

public class X2 {

    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        int e = 0;
        int f = 1;
        int g = 1;
        int h = 1;
        int rsl1 = X2.calc(e, f, g, h);
        System.out.println(rsl1);
        int i = 1;
        int j = 1;
        int k = 0;
        int l = 1;
        int rsl2 = X2.calc(i, j, k, l);
        System.out.println(rsl2);
        int m = 1;
        int n = 1;
        int o = 1;
        int p = 0;
        int rsl3 = X2.calc(m, n, o, p);
        System.out.println(rsl3);
    }
}
