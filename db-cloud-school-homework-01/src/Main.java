public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNo(1);
        System.out.println("account number=" + account.getAccountNo());

        /* testing "deposit" method: */
        account.setAmount(500);
        account.deposit(1500);
        System.out.println("account amount=" + account.getAmount());

        /* testing "withdraw" method, printing error message if exception thrown: */
        try {
            account.withdraw(2500);
        } catch (Account.NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("account amount=" + account.getAmount());
        }
        try {
            account.withdraw(1800);
        } catch (Account.NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("account amount=" + account.getAmount());
        }

        /* testing "linkToNationalId" method, printing error message if exception thrown: */
        try {
            account.linkToNationalId(6010203);
        } catch (Account.InvalidNationalIdException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("owner national id=" + account.getNationalId());
        }
        try {
            account.linkToNationalId(40105);
        } catch (Account.InvalidNationalIdException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("owner national id=" + account.getNationalId());
        }
        try {
            account.linkToNationalId(6010230);
        } catch (Account.InvalidNationalIdException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("owner national id=" + account.getNationalId());
        }
        try {
            account.linkToNationalId(5020304);
        } catch (Account.InvalidNationalIdException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("owner national id=" + account.getNationalId());
        }
    }
}
