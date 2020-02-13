public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        {
            account.deposit(10000);
            while (true)
                try {
                    if (account.getAmount() > 6000) {
                        account.withDraw(6000);
                        System.out.println("со счета сняли "+account.getAmount());

                    } else {
                        account.withDraw(4000);
                        System.out.println("счет пуст");
                    }
                } catch (LimitException e) {
                    e.printStackTrace();
                    break;
                }

        }
    }
}
