package by.itstep.bazylevich.javalessons.lesson18.controller;

import by.itstep.bazylevich.javalessons.lesson18.model.logic.ArrayWorker;
import by.itstep.bazylevich.javalessons.lesson18.util.ArrayInitializer;
import by.itstep.bazylevich.javalessons.lesson18.util.Convertor;
import by.itstep.bazylevich.javalessons.lesson18.view.Printer;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            Printer.print("Input size of array: ");
            size = scanner.nextInt();
        } while(size <= 0);

        int[] array = new int [size];

        //ArrayInitializer.userInit(array);
        ArrayInitializer.randomInit(array);

        Printer.print(Convertor.toString(array));

        //logic

        int sum = ArrayWorker.sum(array);
        int max = ArrayWorker.max(array);
        int min = ArrayWorker.min(array);
        double avg = ArrayWorker.avg(array);

        String msg = String.format("\nSum of array alements = %d.\n"+
                     " Max element = %d, min element = %d.\n"+
                    "Average sum = %.2f", sum, max, min,avg);
        //output result
        Printer.print(msg);
    }
}
