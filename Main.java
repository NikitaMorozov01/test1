package com.itproger;

import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a+b<=c || a+c<=b || b+c<=a){
            System.out.println("Такого треугольника не существует!");
        }else if(a==b && b==c) {
            System.out.println("Треугольник равносторонний");
        }else if(a==b || b==c || a==c){
            System.out.println("Треугольник равнобедренный");
        }else if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
            System.out.println("Треугольник прямоугольный");
        }else{
            System.out.println("Треугольник разносторонний");
        }
    }
}
