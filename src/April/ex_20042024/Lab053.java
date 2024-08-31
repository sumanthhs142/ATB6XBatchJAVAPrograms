package April.ex_20042024;

public class Lab053 {
    public static void main(String[] args) {
        String Name ="Pramod"; // Assignment Operators
        String Name2 = new String("Pramod"); //New Operator

        //Both of them save Name , Name2 in different ways in JVM


        System.out.println(Name);
        System.out.println("Your Name is -> "+Name);
        System.out.printf("Your Name is -> %s",Name);
        System.out.println("------All the functions available in string");
        System.out.println(Name.length());
        System.out.println(Name.toLowerCase());
        System.out.println(Name.toUpperCase());

        //Primitive Data Types like byte, int, long, short, double, float, Char, boolean
        // They don't have extra functionality

        //Non - primitive Data Types String
        //They have extra Functionality

        //JAVA is not purely Object Oriented bcz of Primitive data types


    }
}
