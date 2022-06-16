package by.itstep.bazylevich.javalessons.lesson18.model.logic;

public class ArraySearcher {
    public static boolean check(int[]array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int findFirstIndex(int[]array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastIndex(int[]array, int value) {

        for (int i = array.length-1; i >= array.length; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
