package May.ex_07052024;

public class Lab153 {
    public static void main(String[] args) {
        //Non - return with no parameter
        saySomethingPlease();

        //Non - return with parameter
        sayHelloToYou("sumanth");

        //Return with no parameter
        sumofTwoBad(3,4);

        //Return with parameter
        int result = sumofTwoGood(4,5);
        System.out.println(result);

    }

    static int sumofTwoGood(int a, int b) {
        return a+b;
    }

    static void sumofTwoBad(int a, int b) {
        System.out.println(a+b);
    }

    static void sayHelloToYou(String sumanth) {
        System.out.println("Hello, "+sumanth);
    }

    static void saySomethingPlease() {
        System.out.println("Non - return with no parameter");
    }
}
