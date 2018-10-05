package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main9_6 {
    //9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
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
            int[][] workArray = new int [(int)k][(int)k];
            Random a = new Random();
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    workArray[i][j]=a.nextInt(100+1+100)-100;//диапазон случайных чисел -100->100
                    System.out.print(workArray[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Матрица, вычитая из элементов каждой строки матрицы ее среднее арифметическое: ");
            double sumElements=0;
            double [] averages = new double[(int)k];
            for (int i = 0; i < k; i++) {
                  sumElements=0;
                for (int j = 0; j < k; j++) {
                    sumElements+=workArray[i][j];
                }
                averages[i]=sumElements/(int)k;
            }
            double[][] newMatrix=new double[(int)k][(int)k];
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    newMatrix[i][j]=workArray[i][j]-averages[i];
                    System.out.format("%.2f ", newMatrix[i][j]);
                }
                System.out.println();
            }
        }
        else System.out.println("Число "+size+" не подходит.");
        }

    }



