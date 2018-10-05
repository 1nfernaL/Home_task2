package com.company;

import javafx.scene.chart.BubbleChart;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main9_1 {
    //9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
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
                    workArray[i][j]=a.nextInt(100+1+100)-100;//диапазон случайных чисел -100->100
                    System.out.print(workArray[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Строки матрици в порядке возрастания значений: ");
            for (int arr[]: workArray
                 ) {
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
            }
        }
        else System.out.println("Число "+size+" не подходит.");
        }
    }



