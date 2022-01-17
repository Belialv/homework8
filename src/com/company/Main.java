package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите ширину:");
        int w = x.nextInt();//ширина
        System.out.println("Введите высоту:");
        int h = x.nextInt();//высота
        System.out.println("Введите длинну:");
        int l = x.nextInt();//длинна
        if ( w > 20){
            System.out.print("недопустимые размеры ручной клади\n");
        } else if (w <= 20) {
            System.out.print("допустимые размеры ручной клади\n");
        }
        if (h > 40) {
            System.out.print("недопустимые размеры ручной клади\n");
        } else if (h <= 40) {
            System.out.print("допустимые размеры ручной клади\n");
        }
        if (l > 55) {
            System.out.print("недопустимые размеры ручной клади\n");
        } else if (l <= 55) {
            System.out.print("допустимые размеры ручной клади\n");
        }

        }
    }


