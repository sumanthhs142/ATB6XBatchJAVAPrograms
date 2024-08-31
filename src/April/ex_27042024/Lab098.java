package April.ex_27042024;

import java.util.Scanner;

public class Lab098 {
    public static void main(String[] args) {
        // Program to find Leap Year
        // year%4,
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();

        if ((year%4 ==0 && year%100!=0) || year%400 == 0) System.out.println("Leap Year");
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
