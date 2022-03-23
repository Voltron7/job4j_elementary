package ru.job4j.condition;

public class X2 {

    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static int calc1(int e, int f, int g, int h) {
        return e * h * h + f * h + g;
    }

    public static int calc2(int i, int j, int k, int l) {
        return i * l * l + j * l + k;
    }

    public static int calc3(int m, int n, int o, int p) {
        return m * p * p + n * p + o;
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
        int rsl1 = X2.calc1(e, f, g, h);
        System.out.println(rsl1);
        int i = 1;
        int j = 1;
        int k = 0;
        int l = 1;
        int rsl2 = X2.calc2(i, j, k, l);
        System.out.println(rsl2);
        int m = 1;
        int n = 1;
        int o = 1;
        int p = 0;
        int rsl3 = X2.calc2(m, n, o, p);
        System.out.println(rsl3);
    }
}
