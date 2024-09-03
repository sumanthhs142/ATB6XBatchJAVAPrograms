package May.ex_07052024;

import java.util.Scanner;

public class Lab152 {
    public static void main(String[] args) {
        //Function which will greet the user
        // If you the give the name -> Hello Name
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter your Name");
        String name = sc.next();
        sayHello(name);
    }
    static  void sayHello(String name){
        System.out.println("Hello, "+name);
    }
}
