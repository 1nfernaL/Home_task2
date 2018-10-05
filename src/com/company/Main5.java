package com.company;

import java.util.*;

public class Main5 {
    //5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Введите ряд чисел через пробел: ");
        Integer[] nums = new Integer[size];
        for (int i = 0; i < size; i++) {
            nums[i]=scan.nextInt();
        }
        System.out.println();
        int counterEven=0;
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0) {
                digits.add(nums[i]);
                counterEven++;
            }
        }
        System.out.println("Кол-во чётных чисел = " + counterEven);
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < digits.size(); i++) {
            Integer[] digit =new Integer[2];
            Arrays.fill(digit, 0);
            for (int j = 0; j < String.valueOf(digits.get(i)).length(); j++) {
                int current = String.valueOf(digits.get(i)).charAt(j);
                int index = current % 2 == 0 ? 0 : 1;
                digit[index]++;
            }
            if(digit[0] == digit[1]){
                results.add(digits.get(i));
            }
        }
        System.out.println("Чётные числа, в которых кол-во чётных и нечётных чисел совпадает: ");
        System.out.print(results);
        }
    }



