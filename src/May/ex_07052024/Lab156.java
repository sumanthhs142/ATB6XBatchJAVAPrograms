package May.ex_07052024;

public class Lab156 {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        System.out.println("End of the Program");
        String dutta = "dutta";
        main(10);
        main("pramod");
        main(new String[]{"pramod"},"dutta");
    }
    static void main(int a) {
        System.out.println(a);
    }

    static void main(String a) {
        System.out.println(a);
    }

    static String main(String[] a,String b) {
        System.out.println(a);
        return "Hello";
    }
    static  void god(){
        main(new String[]{"12"});
    }
}
