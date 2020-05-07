public class CreditPaymentService {
    public double calculate(int amount, int month, double percent) {
        double mp = amount*percent/1200*Math.pow((1+percent/1200), month)/(Math.pow((1+percent/1200), month)-1);
        return mp;
    }
}