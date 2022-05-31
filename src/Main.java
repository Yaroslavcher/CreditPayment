public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        double rate = 9.99;
        System.out.println("Сумма кредита: " + sum + " руб");
        System.out.println("Процентная ставка: " + rate + "% годовых");

        int i = 1;
        while (i < 4) {
            int period = 12 * i;

            double payment = service.calculate(sum, period, rate);
            int intPayment = (int) payment;
            System.out.println("Срок кредита: " + period + " мес");
            System.out.println("Ежемесячный платеж: " + intPayment + " руб");
            System.out.println("-------------------------");
            i = i + 1;
        }
    }
}
