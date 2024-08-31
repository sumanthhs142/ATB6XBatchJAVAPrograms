package April.ex_25042024;

public class Lab087 {
    public static void main(String[] args) {
        int itemCode = 001;
        //JDK >13

        switch (itemCode){
            case 001 ->
                    System.out.println("It's a Laptop");
            case 002 -> System.out.println("It's a Desktop");
            case 003, 004 -> System.out.println("It's a Mobile device");
            default -> System.out.println("Hello!");
        }

        char ch = 'a';
        //JDK >13

        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("It's a Vowel");
            default -> System.out.println("Consonant");
        }



    }
}
