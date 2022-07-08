package monocept;

public class Account {
		private String accNumber;
		private String name;
		private double balance;
		
		
		public Account( String name, double balance) {
			this.accNumber = generateAccountNumber();
			this.name = name;
			this.balance = balance;
		}
                private String generateAccountNumber() {
			String uuid=UUID.randomUUID().toString();
			return uuid;
		}

		public int getAccNumber() {
			return accNumber;
		}


		public String getName() {
			return name;
		}


		public double getBalance() {
			return balance;
		}
		
		private double deposit(double amount) {
			 balance=balance+amount;
			 return balance;
			
		}
		public  double withdrawal(double amount) {
		     balance = balance-amount;
		     return balance;
			
		}
		public double getMaxBalanceAccount(Account[] accounts) {
			int length=accounts.length;
			double max=accounts[0].balance;
			for (int i=0;i<length;i++) {
				if(accounts[i].balance>max){max=accounts[i].balance;}
				
			}
			return max;
		}
		
}


package monocept.model;

import monocept.Account;

public class Accounttest {
		public static void main(String[]args) {
		        Account accountarray[]=new Account[3];
			Account a1= new Account("manu",1000.00);
			
			Account a2= new Account("loki",1000.00);
			
			Account a3= new Account("variant",1000.00);
			accountarray[0]=a1;
			accountarray[1]=a2;
			accountarray[2]=a3;
			double maxbalance=a1.getMaxBalanceAccount(accountarray);
			System.out.println(maxbalance);
			double bal=a1.withdrawal(500.00);
			System.out.println(bal);
			
			
			
			
			
			
			
			
		}
}
