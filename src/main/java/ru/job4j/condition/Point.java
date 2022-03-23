package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static double distance1(int x1, int y1, int x2, int y2) {
        double rsl1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl1;
    }

    public static double distance2(int x1, int y1, int x2, int y2) {
        double rsl2 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl2;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result1 = Point.distance1(0, 0, 3, 0);
        System.out.println("result (0, 0) to (3, 0) " + result1);

        double result2 = Point.distance2(0, 0, 4, 0);
        System.out.println("result (0, 0) to (4, 0) " + result2);
    }
}
