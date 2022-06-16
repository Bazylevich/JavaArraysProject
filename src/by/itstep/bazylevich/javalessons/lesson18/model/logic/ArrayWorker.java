package by.itstep.bazylevich.javalessons.lesson18.model.logic;

public class ArrayWorker {
    public static int sum(int[] array) {
        int sum = 0;

        for(int i = 0; i < array.length; i++){
           sum += array[i];
        }
        return sum;

    }
    public static int max(int[] array) {
        //int max = Integer.MIN_VALUE;
        int max = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i]> max){
                max = array[i];
            }
        }
        return max;
    }
    public static int min(int[] array) {
        //int min = Integer.MAX_VALUE;
        int min = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static double avg(int[] array) {

        return sum(array) * 1.0 /(double) array.length;
    }
}
