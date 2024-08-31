package April.ex_27042024;

import java.util.Scanner;

public class Lab096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3");
        int num3 = sc.nextInt();

        int largest = (num1>=num2) ? (num1>=num3 ? num1:num3):(num2>=num3 ? num2:num3);
        // (num1>=num2) -> true then a , false is b
        // a = (num1>=num3 ? num1:num3) -> num1 if true, num3 if false
        // b = (num2>=num3 ? num2:num3) -> num2 if true, num3 if false
        System.out.println("Largest number ->"+largest);
    }
}
