public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1000000;
        int month = 12;
        int percent = 999;
        float mp = service.calculate(amount, month, percent);
        System.out.println("Ваш емесячный платеж: " + mp);
    }
}