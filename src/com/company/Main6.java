package com.company;

import java.util.*;

public class Main6 {
    //6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Введите ряд чисел через пробел: ");
        String[] nums = new String[size];
        for (int i = 0; i < size; i++) {
            nums[i]=scan.next();
        }
        System.out.println();
        boolean isOK = true;
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            boolean isPristine = true;
            for (int j = 0; j < nums[i].length()-1; j++) {
                if ((int)nums[i].charAt(j)>(int)nums[i].charAt(j+1)){
                    isOK=false;
                    isPristine = false;
                }
            }
         if(isPristine)
             isOK = true;
         if (isOK) {
             result = nums[i];
             break;
         }
        }
        System.out.println("Первое число, цифры в котором идут в строгом порядке возрастания: ");
        System.out.println(result);
        if(!isOK) System.out.println("такого числа нет");
        }
    }



