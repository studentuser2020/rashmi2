import java.util.Scanner;

public class CheckingAccount {

	    int accountNumber;
	    double accountBalance;
	
	    public CheckingAccount(int num, double bal)
	{
	
	    accountNumber = num;
	
	    accountBalance = bal;
	
	    }

	    public CheckingAccount()

	    {

	    accountBalance = 0;

	    }

	    public void showAccount()
	    {
	      System.out.println("Account number: " + accountNumber);
	      System.out.println("Balance: " + accountBalance);
	      System.out.println("If your balance is under $200, then your balance is set to zero.");

	}
		    public static void main(String[] args)
	    {
		      int n;
		      double b;
		
		      CheckingAccount account1 = new CheckingAccount();
		      CheckingAccount account2 = new CheckingAccount();

		      @SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);

		      System.out.print("Enter your account number ");
		      n = keyboard.nextInt();
		      System.out.print("Enter your account balance ");

		      b = keyboard.nextDouble();

		      account1.showAccount();

		      account2.showAccount();

		
	}

}
