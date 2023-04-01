package ATM;

import java.util.ArrayList;


public class AtmDesign {
	ArrayList<String> tranhist = new ArrayList<>();
		private double balanceAmt;
		
		public double getBalance() {
			return balanceAmt;
		}
		public void setBalance(double amount) {
			balanceAmt = amount;
		}

		public void depositAmt(double depositAmt) {
			System.out.println(depositAmt + " deposited successfully.");
			setBalance(getBalance() + depositAmt);
			System.out.println("Available Balance: " + getBalance());
			tranhist.add(depositAmt + " deposited.");
		}
		public void withdrawAmt(double withdrawAmt) {
			System.out.println(withdrawAmt + " withdrawn successfully.");
			setBalance(getBalance() - withdrawAmt);
			System.out.println("Available Balance: " + getBalance());
			tranhist.add(withdrawAmt +  " withdrawn.");
		}
		public void transfer(double amount, int acnum) {
			setBalance(getBalance() - amount);
			System.out.println("Amount of "+amount+ " has transfered to the account number  "+ acnum+ " successfully.");
			System.out.println("Available Balance: " + getBalance());
			tranhist.add(amount + " transferred to account number "+acnum);
		}
		public void transactionHistory() {
			tranhist.forEach(hist -> {
				System.out.println(hist);
			});
		}
	
}
