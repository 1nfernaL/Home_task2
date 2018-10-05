package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    //8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
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
            int a=0;
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    a++;
                    workArray[i][j]=a;
                    System.out.print(workArray[i][j] + "  ");
                }
                System.out.println();
            }
        }
        else System.out.println("Число "+size+" не подходит.");

        }
    }



