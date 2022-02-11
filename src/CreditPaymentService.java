public class CreditPaymentService {

    public int calculate (int amountOfCredit, int creditTerm, double loanRate) {
        double monthlyLoanRate = loanRate / (100*12);     //месячная ставка по кредиту
        double denominator = 1 - Math.pow(1+monthlyLoanRate, -creditTerm);

        double monthlyPaymentForMonths = amountOfCredit * (monthlyLoanRate/denominator);

        return (int) monthlyPaymentForMonths;
    }
}
