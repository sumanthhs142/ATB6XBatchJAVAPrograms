package May.ex_04052024;

public class Lab135 {
    public static void main(String[] args) {
        //Arrays

        //find the mx in arrays
        int [] salaries = {30,50,60,90,100,999};
        int max =Integer.MIN_VALUE;

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i]>max){
                max=salaries[i];
            }

        }
//        int j=0;
//        while (j<salaries.length){
//            if (salaries[j]>max){
//                max = salaries[j];
//            }
//            j++;
//        }

        System.out.println("Max salary is ->"+max);
    }
}
