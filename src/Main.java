public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int a = service.calculate(1_000_000,9.99, 12);
        System.out.println("1 yr: ");
        System.out.println(a);

        System.out.println();
        System.out.println("2 yrs:");
        int b = service.calculate(1_000_000, 9.99, 24);
        System.out.println(b);

        System.out.println();
        System.out.println("3 yrs:");
        int c = service.calculate(1_000_000, 9.99, 36);
        System.out.println(c);

    }
}