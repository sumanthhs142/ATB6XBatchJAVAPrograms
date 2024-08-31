package April.ex_25042024;

import com.sun.source.tree.SwitchTree;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        // Take a user input as char and tell the user if it is vowel
        //a,e,i,o,u
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Char, I will tell you, If it si vowel or not");
        char user_input = sc.next().toCharArray()[0];
        //char user_input = sc.next().charAt(0);

        switch (user_input){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, it is consonant");

        }
        sc.close();






    }
}
