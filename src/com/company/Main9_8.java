package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main9_8 {
    //9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
    public static void main(String[] args) {
        System.out.println("Введите подходящее число, чтобы получить матрицу NxN, и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println();
        double k=Math.sqrt(size);
        int t = (int)k;
        if (k - t == 0) {
            int[][] workArray = new int[(int)k][(int)k];
            Random a = new Random();
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    workArray[i][j]=a.nextInt(5+1+5)-5;//диапазон случайных чисел -100->100
                    System.out.print(workArray[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных: ");
            int [][] rotMat = Methods.zeroToRight(workArray);
            for (int i = 0; i < rotMat.length; i++) {
                for (int j = 0; j < rotMat[i].length; j++) {
                    System.out.print(rotMat[i][j]+" ");
                }
                System.out.println();
            }

        }
        else System.out.println("Число "+size+" не подходит.");
        }

    }



