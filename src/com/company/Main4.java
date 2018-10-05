package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Main4 {
    //4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
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

        int maxIndex=-1;
        int maxValue = -1;
        for (int i = 0; i < nums.length; i++) {
           Integer[]digits = new Integer[10];
            for (int k = 0; k < digits.length; k++) {
                digits[k] = 0;
            }
            for (int j = 0; j < nums[i].length(); j++) {
                int digit=Integer.parseInt(nums[i].substring(j, j+1));
                digits[digit]++;
                int currentMax = Collections.max(Arrays.asList(digits));
                if(maxValue < currentMax){
                    maxIndex = i;
                    maxValue = currentMax;
                }
            }
            }
        System.out.println("Число, в котором число различных цифр минимально: ");
        System.out.println(nums[maxIndex]);
        }
    }



