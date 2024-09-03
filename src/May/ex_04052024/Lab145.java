package May.ex_04052024;

public class Lab145 {
    public static void main(String[] args) {
        String name = "Pramod";
        String rev_name="";
        for (int i = 0; i <name.length(); i++) {
            rev_name = name.charAt(i)+rev_name;
            System.out.println(rev_name);
        }
        System.out.println("Reversed String is -> "+rev_name);
    }
}
