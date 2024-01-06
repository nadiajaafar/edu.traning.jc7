package edu.traning.jc7;

import java.util.Arrays;
public class Main02 {


    public class DistanceCalculator {

        public static double calculateDistance(double[] pointC, double[] pointB) {

            double sum = 0;
            for (int i = 0; i < pointC.length; i++) {
                double diff = pointC[i] - pointB[i];
                sum += Math.pow(diff, 2);
            }

            return Math.sqrt(sum);
        }

        public static void main(String[] args) {
            double[] pointC = {1.0, 2.0, 3.0};
            double[] pointB = {4.0, 5.0, 6.0};

            double distance = calculateDistance(pointC, pointB);

            System.out.println("Расстояние между точками: " + distance);
        }
    }



}
