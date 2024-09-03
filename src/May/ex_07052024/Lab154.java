package May.ex_07052024;

import java.util.Scanner;

public class Lab154 {
    public static void main(String[] args) {
        /**
         * divide the task into the smaller chunks
         * calculator
         * - sum Task -> sum function
         * - sub Task -> sub function
         * - mul Task-> mul function

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2");
        int num2 = sc.nextInt();

        //Calc
        int r_sum = sum(num1,num2);
        int r_sub = sub(num1,num2);
        int r_mul = mul(num1,num2);
        int r_div = div(num1,num2);

        System.out.println("Sum is -> "+r_sum);
        System.out.println("Sub is -> "+r_sub);
        System.out.println("Mul is -> "+r_mul);
        System.out.println("Div is -> "+r_div);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
}
