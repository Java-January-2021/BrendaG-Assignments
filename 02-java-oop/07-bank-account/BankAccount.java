import java.util.Random;

public class BankAccount {
    protected String accountNum;
    protected double checkingBalance;
    protected double savingBalance;
    private static int numOfAccounts;
    private static double totalAmountOfMoney;
    String acc_checking= "CHECKING";
    String acc_saving = "SAVINGS";

	private static String generateId() {
		String subst = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			subst += r.nextInt(10);
		}
		return subst;
	}
    public void BankAccount(){
        accountNum = generateId();
        System.out.println("Account Number : " + accountNum);
        numOfAccounts = numOfAccounts + 1;
    }

    public void getCheckingAccountBalance(){
        this.checkingBalance = checkingBalance;
        System.out.println("Checking Account: " + this.checkingBalance);
    }


    public void getSavingAccountBalance(){
        this.savingBalance = savingBalance;
        System.out.println("Savings Account: " + this.savingBalance);
    }

    public void depositMoney(String typeOfAccount, int depoMoney){

        if (typeOfAccount.toUpperCase().equals(acc_checking)){
            checkingBalance += depoMoney;
        }
        else if (typeOfAccount.toUpperCase().equals(acc_saving)){
            savingBalance += depoMoney;
        }
        else{
            System.out.println("Please enter the info correctly");
        }
        totalAmountOfMoney = checkingBalance + savingBalance;
    }

    public void withdrawMoney(String typeOfAccount, int amount){
        if ((typeOfAccount.toUpperCase().equals(acc_checking)) && (checkingBalance > 100)){
            checkingBalance -= amount;
            System.out.println("You have withdrawn: "+ amount +" Total remaining balance is: " + checkingBalance);
        }
        else if ((typeOfAccount.toUpperCase().equals(acc_saving)) && (savingBalance > 300)){
            savingBalance -= amount;
            System.out.println("You have withdrawn: "+ amount +" Total remaining balance is: " + savingBalance);
        }
        else{
            System.out.println("You have insufficient funds. Please reach out to your bank for more info.");
        } 
        totalAmountOfMoney = checkingBalance + savingBalance;
    }

    public void totalMoney(){
        System.out.println("Your total balance is : " + totalAmountOfMoney);
    }
}