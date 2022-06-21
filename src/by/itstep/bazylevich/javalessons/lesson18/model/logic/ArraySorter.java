package by.itstep.bazylevich.javalessons.lesson18.model.logic;

public class ArraySorter {
    public static void bubbleSorAcs(int[] array) {
        for (int j = 0; j < array.length-1; j++) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]<array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
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
