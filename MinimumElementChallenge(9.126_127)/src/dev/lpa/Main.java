package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] returnArray = readIntegers();
        System.out.println(Arrays.toString(returnArray));

//        int returnedMin = findMin(returnArray);
//        System.out.println("Min = " + returnedMin);

//        reserve(returnArray);
//        System.out.println("Final: " + Arrays.toString(returnArray));
        int[] reversedCopy = reserveCopy(returnArray);
        System.out.println("After reverse " + Arrays.toString(returnArray));
        System.out.println("ReversedCopy " + Arrays.toString(reversedCopy));
    }

    private static int[] readIntegers()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++)
        {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

//    private static int findMin(int[] array)
//    {
//        int min = Integer.MAX_VALUE;
//        for (int el : array)
//        {
//            if (el < min)
//            {
//                min = el;
//            }
//        }
//        return min;
//    }

    private static void reserve(int[] array)
    {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("---> " + Arrays.toString(array));
        }
    }

    private static int[] reserveCopy(int[] array)
    {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array){
            reversedArray[maxIndex--] = el;
        }

        return reversedArray;
    }
}
