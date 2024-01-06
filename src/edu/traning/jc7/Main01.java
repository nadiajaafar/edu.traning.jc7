package edu.traning.jc7;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        double[] array = new double[5];

        Scanner sc = new Scanner(System.in);

        for ( int i = 0; i < array.length; i++) {

            System.out.println("ar[" + i + "]=>");
            array[i]= sc.nextInt();


        }
        printArray (array);

        division(array);
    }

    public static void division(double[] array) {

        double [] y = new double [5];

        for ( int i = 0; i < array.length; i++) {
           y[i] = array[i]/i;

        }
        System.out.println();
        printArray(y);

    }

    public static void printArray(double[] mas) {
        for ( int i = 0; i < mas.length; i++) {
            System.out.println("ar[" + i +"] = " +mas [i]);

        }

    }

}
