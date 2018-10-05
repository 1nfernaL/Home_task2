package com.company;

import java.util.Arrays;

public class Methods {
    //преобразование двумерного массива в одномерный
    public static int[] d2Tod1(int[][] array){

        int[] newArray = new int[array.length*array[0].length];

        for (int i = 0; i < array.length; ++i)
            for (int j = 0; j < array[i].length; ++j) {
                newArray[i*array[0].length+j] = array[i][j];
            }

        return newArray;

    }
    //преобразование одномерного массива в двумерный
     public static int[][] d1Tod2(int[] array, int width){

        int[][] newArray = new int[array.length/width][width];

        for (int i = 0; i < array.length; ++i) {
            newArray[i/width][i%width] = array[i];
        }

        return newArray;
    }
    //Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных
    public static int[][] zeroToRight(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            int n = 0;
            int[] c = new int[b.length];
            for (int j = 0; j < b.length; j++) {
                if (b[i][j] != 0) {
                    c[n++] = b[i][j];
                }
            }
            b[i] = Arrays.copyOf(c, c.length);
        }
        return b;
    }
}
