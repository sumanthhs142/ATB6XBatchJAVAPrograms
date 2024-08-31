package April.ex_20042024;

public class Lab059 {
    public static void main(String[] args) {
        String name= "The Testing Academy";
        String name1 = "The Testing Academy"; // String Constant Pool

        String name3 = new String("The Testing Academy"); //Heap Area (OA)

        System.out.println(name == name1); //Check the reference

        System.out.println(name.equals(name1)); //Check the values


        System.out.println(name == name3);
        System.out.println(name.equals(name3));
    }
}
