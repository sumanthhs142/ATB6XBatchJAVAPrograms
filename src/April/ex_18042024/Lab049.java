package April.ex_18042024;

public class Lab049 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        //PART A -> ++a -> EP_Result1 = 11, a = 11
        //PART B -> a++ -> EP_result2 = 11, a= 12
        //PART C -> a++ -> EP_result3 =12, a=13

        //Output = EP_Result1 + EP_Result2 + EP_Result3s
    }
}
