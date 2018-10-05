package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
//3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
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
        float average=0f;
        for (String item : nums
             ) {
            average += (float) item.length();
        }
        average /= nums.length;
        boolean a=false;
        System.out.println("Средняя длинна чисел = " + average);
        System.out.println("Числа, длинна которых меньше, чем средняя: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].length() < average) {
                System.out.println(nums[i]+ " его длинна " + nums[i].length());
                a=true;
            }
        }
        if(!a) System.out.println("таких чисел нет");
    }

    }

