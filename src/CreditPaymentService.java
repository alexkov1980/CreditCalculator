public class CreditPaymentService {
    public double calculate(int sum, double interest, int year) {
        double month = (interest / 12) / 100;
        double m = 1 + month;
        double m1 = Math.pow(m, year * 12);
        double coefficient = (month * m1) / (m1 - 1);
        double result = sum * coefficient;
        return result;

    }
}
