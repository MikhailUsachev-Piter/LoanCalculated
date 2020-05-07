public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1000000;
        int month = 12;
        double percent = 9.99;
        int mp = (int) service.calculate(amount, month, percent);
        System.out.println("Ваш емесячный платеж: " + mp);
    }
}