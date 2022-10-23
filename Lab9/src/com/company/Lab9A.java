package com.company;
import java.util.*;
public class Main {
    public static int recursive_multiply(int num1, int num2){
        if (num2 == 0){
            return 0;
        }else{
            return (num1+(recursive_multiply(num1,num2-1)));
        }
    }
    public static int recursive_div(int num1, int num2){
        if (num2==0)
        {
            return 0;
        }
        else if (num1-num2==0){
            return 1;
        }
        else if (num1<num2){
            return 0;
        }
        else{
            return (1+recursive_div(num1-num2,num2));
        }
    }
    public static int recursive_mod(int num1, int num2){
        if (num2==0)
        {
            return -1;
        }
        else if (num1<num2){
            return num1;
        }
        else{
            return (recursive_mod(num1-num2,num2));
        }
    }




    public static void main(String[] args) {
        boolean cont = true;
        Scanner scan = new Scanner(System.in);
            do{
            System.out.println("Choose from the following:\n" +
                    "0. Quit\n" +
                    "1. Multiply 2 numbers\n" +
                    "2. Div 2 numbers\n" +
                    "3. Mod 2 numbers");
                int userchoice = scan.nextInt();
                switch (userchoice){
                    case 0:
                        cont = false;
                        break;
                    case 1:
                        System.out.println("Enter first number");
                        int input1 = scan.nextInt();
                        System.out.println("Enter second number");
                        int input2= scan.nextInt();
                        System.out.println(recursive_multiply(input1,input2));
                        break;
                    case 2:
                        System.out.println("Enter first number");
                        int input3 = scan.nextInt();
                        System.out.println("Enter second number");
                        int input4= scan.nextInt();
                        System.out.println(recursive_div(input3,input4));
                        break;

                    case 3:
                        System.out.println("Enter first number");
                        int input5 = scan.nextInt();
                        System.out.println("Enter second number");
                        int input6= scan.nextInt();
                        System.out.println(recursive_mod(input5,input6));
                        break;
                }
            }while(cont == true);
    }
}
