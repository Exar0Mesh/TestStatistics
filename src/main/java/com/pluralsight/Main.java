package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {75, 87, 95, 54, 100, 100, 83, 70, 41, 95};
        int[] testScores = getNumbers();
        int division = testScores.length;
        int sum = 0;
        //System.out.println(division);

        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Average equals: " + sum/division);

        int i;
        int max = testScores[0];
        int min = testScores[0];

        for (i = 1; i < testScores.length; i++) {
            if (testScores[i] > max)
                max = testScores[i];
        }
        System.out.println("Maximum equals: " + max);

        for (i = 1; i < testScores.length; i++) {
            if (testScores[i] < min)
                min = testScores[i];
        }
        System.out.println("Minimum equals: " + min);
    }

    public static int[] getNumbers() {
        int[] numbers = {75, 87, 95, 54, 100, 100, 83, 70, 41, 95};
        return numbers;
    }


}