package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
//2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Введите ряд чисел через пробел: ");
        Integer [] nums =new  Integer[size];
        for (int i = 0; i < size; i++) {
            nums[i]=scan.nextInt();
        }
        System.out.println();
        for (int barrier = nums.length-1; barrier >=0 ; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (nums[index] > nums[index + 1]) {
                    int tmp=nums[index];
                    nums[index]=nums[index+1];
                    nums[index+1]=tmp;
                }
            }
        }
        System.out.println("Упорядочить и вывести числа в порядке возрастания значений их длины.");
        System.out.println(Arrays.toString(nums));
        }

    }

