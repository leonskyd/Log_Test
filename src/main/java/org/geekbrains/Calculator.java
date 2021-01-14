package org.geekbrains;

import java.util.Arrays;

public class Calculator {
    public int Sum(int a, int b) {
        return a + b;
    }

    public int Mult(int a, int b) {
        return a * b;
    }

    public int Dividing(int a, int b) {
        return a / b;
    }

    public int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    
    // МЕТОДЫ ДЛЯ ДОМАШНЕЙ РАБОТЫ

    public int[] arrAfterFour (int [] arr) {
        int i = arr.length-1;
        int [] arrResult = new int[0];
        try {
            while (arr[i] != 4) {
                i--;
            }
            int size = arr.length - i - 1;
            arrResult = new int[size];
            int index = i + 1;
            for (int j = 0; j < arrResult.length; j++) {
                arrResult[j] = arr[index];
                index++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("The array does not contain a FOUR !!! \n Please use other array");
        }
        return arrResult;
    }

    public boolean OneAndFour (int [] arr) {
            boolean status = true;
        for (int i = 0; i < arr.length; i++) { 
            status = true;
            if (arr[i] != 1 && arr[i] != 4) {
                System.out.println(" No other than 1 and 4 are allowed !!! ");
                status = false;
                break;
            } 
        }
        Arrays.sort(arr);
        if (arr[0] == arr[arr.length-1])
        {   System.out.println(" should be both 1 and 4 in the array !!!");
            status = false; }
        return status;
    }
}

