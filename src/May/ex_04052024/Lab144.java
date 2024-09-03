package May.ex_04052024;

import java.util.Scanner;

public class Lab144 {
    public static void main(String[] args) {

        //Palindrome

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string I will if it is a palindrome or not");
        String user_input = sc.next();

        StringBuilder sb= new StringBuilder(user_input);
        String reverse_user_input = sb.reverse().toString();
        //reverse function returns stringbuilder need to convert to string
        if (user_input.equalsIgnoreCase(reverse_user_input)){
            System.out.println("This is a Palindrome -> "+user_input);
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
