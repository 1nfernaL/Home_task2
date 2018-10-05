package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main9_2 {
    //9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо
    //(влево, вверх, вниз).
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
            System.out.println("Циклический сдвиг заданной матрицы на c позиций вправо: ");
            int[] d1 = Methods.d2Tod1(workArray);
            int[]shift=new int[d1.length];
            int c=1;
            shift[0]=d1[d1.length-1];
            for (int i = 0; i < d1.length-1; i++) {
                shift[c]=d1[i];
                c++;
            }
            for (int i = 0; i < shift.length; i++) {
                System.out.print(shift[i]+" ");
                if ((i + 1) % k == 0) {
                    System.out.println();
                }
            }
        }
        else System.out.println("Число "+size+" не подходит.");
        }

    }



