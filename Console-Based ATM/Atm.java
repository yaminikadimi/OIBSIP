package ATM;

import java.util.Scanner;

public class Atm {

	public static void main(String args[]) {
		AtmDesign ad = new AtmDesign();

		int atmNumber = 987357;
		int atmPin = 6249;
		
		try{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ATM number: ");
		int atmnumber=sc.nextInt();
		System.out.print("Enter ATM pin: ");
		int atmpin=sc.nextInt();
	
		if(atmNumber == atmnumber && atmPin == atmpin) {
			while(true) {
			System.out.println("\n1. Balance \n2. Deposit Amount \n3. Withdraw Amount \n4. Transfer to another account \n5. Transaction History  \n6. Exit");
			System.out.print("Enter the choice for the corresponding action:");
			int ch=sc.nextInt();
			
			if(ch==1) {
				System.out.println("Available Balance: "+ad.getBalance());
			}
			else if(ch==2) {
				System.out.print("Enter amount to deposit:");
				double depositAmt = sc.nextDouble();
				if(depositAmt>0) {
					ad.depositAmt(depositAmt);
				}
				else {
					System.out.println("\t\tInvalid Amount to deposit!");
				}
			}
			else if(ch==3) {
				System.out.print("Enter amount to withdraw:");
				double withdrawAmt = sc.nextDouble();
				if(withdrawAmt> 0 &&withdrawAmt <= ad.getBalance()) {
					ad.withdrawAmt(withdrawAmt);
				}
				else if(withdrawAmt <= 0){
					System.out.println("\t\tInvalid Amount to withdraw!");
				}
				else {
					System.out.println("\t\tInsufficient balance");
					System.out.println("Available Balance: "+ad.getBalance());
				}
			}
			else if(ch==4) {
				System.out.print("Enter the account number :");
				int acnum = sc.nextInt();
				if(acnum <= 0 ){
					System.out.println("\t\tInvalid Account number to transfer!");
				}
				System.out.print("Enter the amount to transfer :");
				double TransferAmt = sc.nextDouble();
				if(acnum>0 && TransferAmt> 0 && TransferAmt <= ad.getBalance()) {
					ad.transfer(TransferAmt, acnum);
				}
				else if(TransferAmt <= 0 ){
					System.out.println("\t\tInvalid Amount to transfer!\n");
				}
				else {
					System.out.println("\t\tInsufficient balance\n");
					System.out.println("Available Balance: "+ad.getBalance());
				}
			}
			else if(ch==5) {
				ad.transactionHistory();
			}
			else if(ch==6) {
				System.out.print("\n\t\tThankyou for using ATM\t\t\n\t\tPlease collect your ATM card\t\t");
				System.exit(0);
			}
			
			else {
				System.out.print("\n\tInvalid choice!\n");
			}
			}
		}
		
		else {
			System.out.println("\n\tInvalid ATM Number or ATM Pin");
		}
		sc.close();
		}
	catch(Exception e) {
		System.out.println("\n\tAn error occured!");
	}
	}
}


