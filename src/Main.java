public class Main{
    public static void main(String[] args) {
        int bill = 100;
        int billAdd = 1100;
        long bonus;
        if (billAdd > 1000) {
            bonus = billAdd / 100;
        } else {
            bonus = 0;
        }
        long billTotal = bill + billAdd + bonus;
        System.out.println ("Bonus: " + bonus);
        System.out.println("Total: " + billTotal);
    }
}

