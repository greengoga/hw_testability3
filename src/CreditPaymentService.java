/*
P = S * ((montlyRate * (1+monthlyRate)**n) / ((1+monhlyRate)**n - 1))

P = 87 911 — аннуитетный платеж по кредиту,
S = 1 000 000 —  сумма займа,
r = 9.99 — процентная ставка,
n = 12/24/36 — срок кредита в месяцах.
expected = 87911/46140/32262
((1 + годовая ставка / 100)1/12 — 1) × 100 %
*/

public class CreditPaymentService {

    public int calculate(int S, double r, int n) {

        int P;
        double x = (double) 1 / n;
        double monthlyRate = (Math.pow((1 + (r / 100)), x) - 1) * 100;
        double monthlyC = (monthlyRate * Math.pow(1 + monthlyRate, n)) / (Math.pow(1 + monthlyRate, n) - 1);
        //double monthlyPow = Math.pow(1 + monthlyRate, n);
        P = (int) (monthlyC * S);
        //P = (int) (S * ((monthlyRate * monthlyPow) / (monthlyPow - 1)));
        return P;

/*
        int P;
        double x = (double) 1 / n;
        double monthlyRate = (Math.pow((1 + (r / 100)), x) - 1) * 100;

        //(r / n) / 100;
        // (1 + ((r / 100) / n));
        //(((1 + (r / 100)) * (1 / n)) - 1) * 1/100;
        //S * ((monthlyRate * (1+monthlyRate)**n) / ((1+monthlyRate)**n - 1));

        double monthlyPow = Math.pow(monthlyRate, n);

        P = (int) (S * (monthlyRate * (1 + monthlyPow) / (monthlyPow - 1)));
        //(int) (S * ((monthlyRate * monthlyPow) / (monthlyPow - 1)));
        return P;

 */
    }
}
