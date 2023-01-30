import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // Вводим сумму кредита
        int summ = 1_000_000;
        // Вводим процентную ставку кредита
        double rate = 9.99f;
        // Расчет ежемесячного платежа при сроке кредита 1 год
        int monthPayment1 = (int) service.calculate(summ, rate, 1);
        System.out.println("Ежемесячный платеж при сроке 1 год " + monthPayment1);
         // Расчет ежемесячного платежа при сроке кредита 2 года
        int monthPayment2 = (int) service.calculate(summ, rate, 2);
        System.out.println("Ежемесячный платеж при сроке 2 года " + monthPayment2);
        // Расчет ежемесячного платежа при сроке кредита 3 года
        int monthPayment3 = (int) service.calculate(summ, rate, 3);
        System.out.println("Ежемесячный платеж при сроке 3 года " + monthPayment3);
    }
}