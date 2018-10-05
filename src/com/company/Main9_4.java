package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main9_4 {
    //9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
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
            System.out.println("Cумма элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки(включая эти элементы): ");
            int[] d1 = Methods.d2Tod1(workArray);
            int sum=0;
            int indexStart =0;
            int indexEnd=0;
            for (int i = 0; i < d1.length; i++) {
                if (d1[i] > 0) {
                    indexStart=i;
                    break;
                }
            }
            for (int i = indexStart+1; i <d1.length; i++) {
                if (d1[i] > 0) {
                    indexEnd=i;
                    break;
                }
            }
            for (int i = indexStart; i <= indexEnd; i++) {
                sum+=d1[i];
            }
            System.out.println(sum);
        }
        else System.out.println("Число "+size+" не подходит.");
        }
    }



