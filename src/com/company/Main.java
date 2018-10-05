package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Введите ряд чисел через пробел: ");
        List<String> nums = new ArrayList<>() ;
        for (int i = 0; i < size; i++) {
            nums.add(scan.next());
        }
        System.out.println();
        int min = 10;
        int max = 0;
        String minStr = null, maxStr=null;
        for (String digi: nums ) {
            if (digi.length() < min) {
                min = digi.length();
                minStr=digi;
                continue;
            }
            if(digi.length() == max){

                maxStr=Integer.parseInt(digi)<Integer.parseInt(maxStr)? maxStr:digi;
                continue;
            }
            if (digi.length() > max) {
                max=digi.length();
                maxStr=digi;
                continue;
            }
        }
        System.out.println("Вывести самое короткое и самое длинное число, а также их длинну:");
        System.out.println("Минимальное число " + minStr + " состоит из " + min
                + " цифр\nМаксимальное число " + maxStr + " состоит из " + max
                + " цифр");
    }
}
