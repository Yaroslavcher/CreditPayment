public class CreditPaymentService {
    public double calculate (int sum, int period, double rate) {
        double payment = (sum*rate/1200)*(1+1/(Math.pow(1+rate/1200, period)-1));
        return payment;
    }
}
