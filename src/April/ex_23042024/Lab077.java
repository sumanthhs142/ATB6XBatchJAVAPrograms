package April.ex_23042024;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        //Grade Calculator
        // A: 90-100
        // B: 80-89
        // C- 70-79
        // D - 60-69
        // F - 0-59

        System.out.println("Please Enter Your Marks");
        Scanner sc= new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks < 100){
            if (marks >=90){
                System.out.println("Your grade is A");
            } else if (marks >=80) {
                System.out.println("Your Grade is B");
            } else if (marks >=70) {
                System.out.println("Your Grade is C");
            } else if (marks >=60) {
                System.out.println("Your Grade is D");
            }else{
                System.out.println("You have Failed Please try Again!");
            }
        }else{
            System.out.println("Please enter Valid Marks out of 100");
        }
        sc.close();
    }
}
