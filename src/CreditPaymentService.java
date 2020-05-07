public class CreditPaymentService {
    public float calculate(int amount, int month, int percent) {
        long mp = amount*percent/12*(1+percent/1200)^month/((1+percent/1200)^month-1);
        return mp;
    }
}