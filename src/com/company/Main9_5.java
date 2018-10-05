package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main9_5 {
    //9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
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
            System.out.println("Повернуть матрицу на 90 градусов против часовой стрелки: ");
            int [][] rotMat = new int[(int)k][(int)k];
            for (int i = 0; i < workArray.length; i++) {   //поворот на 90 градусов против часовой стрелки
                for (int j = 0; j < workArray[i].length; j++) {
                    rotMat[i][j]=workArray[j][(int)k-i-1];
                    System.out.print(rotMat[i][j]+" ");
                }
                System.out.println();
            }
        }
        else System.out.println("Число "+size+" не подходит.");
        }

    }



