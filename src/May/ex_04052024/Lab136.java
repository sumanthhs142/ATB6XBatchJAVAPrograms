package May.ex_04052024;

public class Lab136 {
    public static void main(String[] args) {
        int [] a = {30,40,50,60};
        int [] a2 = new int[3];

        for (int i = 0; i < a.length; i++) {
            a2[i] = a[i]*2;
        }

        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
        //Horizontal arrays = 1D Array


    }
}
