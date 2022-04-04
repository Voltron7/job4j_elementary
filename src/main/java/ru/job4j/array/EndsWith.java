package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        for (char i = 0; i < post.length; i++) {
            if (post[post.length - 1] != word[word.length - 1]) {
                return false;
            }
        }
        return true;
    }
}
