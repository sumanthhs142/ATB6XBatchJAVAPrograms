package April.ex_25042024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the X");
        double x = sc.nextDouble();
        System.out.println("Enter the Value for Y");
        double y = sc.nextDouble();
        System.out.println("Enter the value for the Z");
        double z = sc.nextDouble();

        double result;
        //
        result = Math.cbrt((Math.pow(x,2)+ Math.pow(y,2))-Math.abs(z));
        System.out.println(result);
        sc.close();


    }
}
