/*
P = S * ((montlyRate * (1+monthlyRate)**n) / ((1+monhlyRate)**n - 1))

P = 87 911 — аннуитетный платеж по кредиту,
S = 1 000 000 —  сумма займа,
r = 9.99 — процентная ставка,
n = 12/24/36 — срок кредита в месяцах.
*/

public class CreditPaymentService {

    public int calculate(int S, double r, int n) {
        int P;
        double monthlyRate = r / n / 100;
        double monthlyPow = Math.pow(1 + monthlyRate, n);
        P = (int) (S * ((monthlyRate * monthlyPow) / (monthlyPow - 1)));
        return P;
    }
}
