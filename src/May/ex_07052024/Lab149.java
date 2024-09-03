package May.ex_07052024;

public class Lab149 {
    public static void main(String[] args) {
        //Create a function which will say  Hi
        for (int i = 0; i < 100; i++) {
            sayhi();
            sayBye();
            rama();
        }
    }

    private static void rama() {
        System.out.println("Rama");
    }

    private static void sayBye() {
        System.out.println("Bye");
    }

    static  void sayhi(){
        System.out.println("Hello Hi");
    }
}
