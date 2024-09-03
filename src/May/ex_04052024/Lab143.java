package May.ex_04052024;

public class Lab143 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        String s2 = new String("Pramod");

        StringBuffer stringbuffer = new StringBuffer("Pramod");
        stringbuffer.append("Dutta");
        stringbuffer.reverse();
        System.out.println(stringbuffer);
        //PramodDutta

        StringBuilder stringbuilder = new StringBuilder("Pramod");
        stringbuilder.append("Dutta");

        String password = "pass@123";
        password = "123";


        //Mutable - can be changed
        StringBuilder password2 = new StringBuilder("pass");
        password2.append("@123");
        System.out.println(password2);



    }
}
