public class Main {
    public static void main(String[] args) {
        CreditCalc service = new CreditCalc();
        double mPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Your monthly payment is: " + mPayment);

        double mPayment0 = service.calculate(1_000_000, 9.99, 24);
        System.out.println("Your monthly payment is: " + mPayment0);

        double mPayment1 = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Your monthly payment is: " + mPayment1);
    }
}
