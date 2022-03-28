package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int largest;
        if (first >= second && first >= third) {
            largest = first;
        } else if (second >= first && second >= third) {
            largest = second;
        } else {
        return third;
    }
        return largest;
}

        public static void main(String[] args) {
        System.out.println("Максимальное число из трех: " + ThreeMax.max(10, 5, 1));
    }
}
