package by.itstep.bazylevich.javalessons.lesson18.model.logic;

public class ArraySorter {
    public static void bubbleSorAcs(int[] array) {

    }
    public static void selectedSorAcs(int[] array) {

        for (int j = 0; j < array.length-1; j++) {
            int index = j;

            for (int i = index+1; i < array.length; i++) {
                if (array[i] < array[index]) {
                    index = i;
                }
            }
            int temp = array[j];
            array[j] = array[index];
            array[index] = temp;
        }
    }
}
