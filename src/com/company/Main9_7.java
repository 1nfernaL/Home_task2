package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main9_7 {
    //9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
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
            System.out.println("Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями: ");
            boolean p=false;
            int [][] tmp = workArray; //заполнить нулями некоторые строки и столбцы матрицы
            for (int i = 0; i < tmp.length ; i++) {
                for (int j = 0; j < tmp[i].length; j++) {
                    if (j==1) tmp[i][j]=0;
                    if (i==1) tmp[i][j]=0;
                    System.out.print(tmp[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            int[] count = new int[(int)k];
            Arrays.fill(count,0);
            //удалить лишние строки
            for (int i = 0; i <k ; i++) {
                p=false;
                for (int j = 0; j < k; j++) {
                    if (tmp[i][j] == 0) {
                        p=true;
                    }                                   //находим нулевые строки и заносим их индексы в массив
                    else {
                        p=false;
                        break;
                    }
                }
                if(p) count[i]=1;
            }
            int sum=0;
            for (int i = 0; i < count.length; i++) {      //считаем кол-во нулевых строк
                if (count[i]>0) sum++;
            }
            int [][]result = new int[(int)k-sum][(int)k];
            int index = 0;
            for (int i = 0; i < tmp.length; i++) {
                if (count[i] > 0) {
                    continue;
                }
                for (int j = 0; j < tmp[i].length; j++) {
                    result[index][j]= tmp[i][j];
                }
                index++;
            }
            System.out.println();
            //удалить лишние столбцы
            int[] count2 = new int[result[0].length];
            Arrays.fill(count2,0);
            for (int i = 0; i <result.length ; i++) {
                p=false;
                for (int j = 0; j < result[i].length; j++) {
                    if (tmp[j][i] == 0) {
                        p=true;
                    }                                         //находим нулевые столбцы и заносим их индексы в массив
                    else{
                        p=false;
                        break;
                    }
                }
                if(p) count2[i]=1;
            }
            int sum2=0;
            for (int i = 0; i < count2.length; i++) {         //считаем кол-во нулевых столбцов
                if (count2[i]>0) sum2++;
            }
            int [][]result2 = new int[result.length][result[0].length-sum2];
            int index2 = 0;
            for (int i = 0; i < count2.length; i++) {
                if (count2[i] > 0) {
                    continue;
                }
                else {
                    for (int j = 0; j < result.length; j++) {
                        result2[j][index2]=result[j][i];
                    }
                    index2++;
                }
            }
            for (int i = 0; i < result2.length; i++) {
                for (int j = 0; j < result2[i].length; j++) {
                    System.out.print(result2[i][j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Число "+size+" не подходит.");
        }
    }



