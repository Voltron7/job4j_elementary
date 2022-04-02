package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int temp;
        for (int left = 0, right = array.length - 1; right >= array.length / 2; right--, left++) {
            temp = array[right];
            array[right] = array[left];
            array[left] = temp;

        }
        return array;
    }
}
