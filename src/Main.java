public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount account = new BankAccount();
        account.deposit(10000);
            while (account.getAmount()>0)
                try {
                    account.withDraw(6000);
                } catch (LimitException e){
                    System.out.println("Остаток счета составляет" +e.getRemainingAmount());
                    System.out.println("хотите ли снять " + account.getAmount());
                    account.withDraw(4000);
                    System.out.println(account.getAmount());
                    break;

                }


    }
    }

