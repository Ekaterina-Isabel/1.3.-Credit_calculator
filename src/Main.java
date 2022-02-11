public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountOfCredit = 1_000_000 ;   //сумма кредита
        int creditTerm12 = 12;   //срок кредита
        int creditTerm24 = 24;
        int creditTerm36 = 36;
        double loanRate = 9.99;     //процентная ставка по кредиту

        int monthlyPaymentFor12Months = service.calculate(amountOfCredit, creditTerm12, loanRate);     //ежемесячный платеж для 12 месяцев
        int monthlyPaymentFor24Months = service.calculate(amountOfCredit, creditTerm24, loanRate);     //ежемесячный платеж для 24 месяцев
        int monthlyPaymentFor36Months = service.calculate(amountOfCredit, creditTerm36, loanRate);     //ежемесячный платеж для 36 месяцев

        System.out.println("Ежемесячный платеж: "+ monthlyPaymentFor12Months);      //ежемесячный платеж для 12 месяцев
        System.out.println("Ежемесячный платеж: "+ monthlyPaymentFor24Months);      //ежемесячный платеж для 24 месяцев
        System.out.println("Ежемесячный платеж: "+ monthlyPaymentFor36Months);      //ежемесячный платеж для 36 месяцев
    }
}
