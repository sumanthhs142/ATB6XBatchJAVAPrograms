package May.ex_07052024;

public class Lab155 {
    public static void main(String[] args) {
        // 1 Friend - money
        // 1 Begger - money
        System.out.println("Start of the Program");

        int money = giveMoneyFriend(100);
        System.out.println(money);
        giveMoneyBeg();

        System.out.println("End of the Program");

    }

    static void giveMoneyBeg() {
        System.out.println("Blessing!!!");
    }

    static int giveMoneyFriend(int i) {
        //After 6 Months
        i= i + 10;
        return i;
    }
}
