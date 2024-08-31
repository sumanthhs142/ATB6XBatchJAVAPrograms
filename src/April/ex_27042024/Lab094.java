package April.ex_27042024;

import java.util.Scanner;

public class Lab094 {

    public static void main(String[] args) {
        // Program to check if a number is positive, Negative or zero

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("Positive Number");
        } else if (num<0) {
            System.out.println("negative Number");
        }else {
            System.out.println("zero");
        }
        sc.close();

    }
}
