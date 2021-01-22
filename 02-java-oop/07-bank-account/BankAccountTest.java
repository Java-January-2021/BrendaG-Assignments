public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();

        String acc = "Checking";
        String svg = "savings";

        bankAcc.BankAccount();
        bankAcc.depositMoney(acc, 4000);
        bankAcc.depositMoney(svg, 1000);
        bankAcc.getCheckingAccountBalance();
        bankAcc.getSavingAccountBalance();
        bankAcc.withdrawMoney(acc, 500);
        bankAcc.withdrawMoney(svg,100);
        bankAcc.getCheckingAccountBalance();
        bankAcc.totalMoney();

    }
}
