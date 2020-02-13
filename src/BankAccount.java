public class BankAccount {
     double amount;

    public double getAmount() {
        return amount;
    }

    void deposit(double sum) {
        amount = amount + sum;
        System.out.println("на счет положили" + sum);
    }

    void withDraw(double sum) throws LimitException {
        if (sum >amount) {
            throw new LimitException("не достоточна денег на счету", amount);
        }
        amount=amount-sum;
        System.out.println("счета сняли "+sum);
    }
}
