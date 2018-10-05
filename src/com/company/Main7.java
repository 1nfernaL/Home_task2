package com.company;

import java.util.*;

public class Main7 {
    //7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
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
        String result= "";
        for (int i = 0; i < nums.length; i++) {
            Integer[] digits = new Integer[10];
            boolean isPristine = true;
            Arrays.fill(digits, 0);
            for (int j = 0; j < nums[i].length(); j++) {
                int digit=Integer.parseInt(nums[i].substring(j, j+1));
                digits[digit]++;
                }
            for (int k = 0; k < digits.length; k++) {
                if(digits[k] > 1){
                    isPristine = false;
            }
            }
            if(isPristine){
                result = nums[i];
                break;
            }
        }
        System.out.println("Первое число, состоящее только из различных цифр: ");
        System.out.print(result);
        if(result.length() == 0) System.out.println("такого числа нет");
        }
    }



