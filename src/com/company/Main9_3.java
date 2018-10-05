package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main9_3 {
    //9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
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
            System.out.println("Наибольшее число возрастающих элементов матрицы, идущих подряд: ");
            int[] d1 = Methods.d2Tod1(workArray);
            int counterState=0;
            int current=1;
            for (int i = 1; i <d1.length ; i++) {
                if (d1[i-1]<d1[i]) current++;
                else {
                        counterState=counterState<current?current:counterState;
                        current=1;
            }
            }
            System.out.println(counterState);
        }
        else System.out.println("Число "+size+" не подходит.");
        }

    }



