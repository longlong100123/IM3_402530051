import java.util.*;

public class Bank {
  HashMap<Number,BankAccount> BankList = new HashMap<Number , BankAccount>();
	void deposit(int AccountNumber, double initialNumber){
		BankAccount NewAccount= (BankAccount) BankList.get(AccountNumber);
		try {
			NewAccount.deposit(initialNumber);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	void withdraw(int AccountNumber, double initialNumber){
		BankAccount NewAccount= (BankAccount) BankList.get(AccountNumber);
		try {
			NewAccount.withdraw(initialNumber);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	void addAccount(int AccountNumber , double initialNumber){
		if (initialNumber<0){
			initialNumber=0;
		}
		BankList.put(AccountNumber, new BankAccount(AccountNumber,initialNumber));
	}
	double getBalance(int AccountNumber){
		BankAccount NewAccount=(BankAccount) BankList.get(AccountNumber);
		return NewAccount.getBalance();
	}
	String getState(int AccountNumber){
		BankAccount NewAccount=(BankAccount) BankList.get(AccountNumber);
		return NewAccount.State;
	}
	String summarizeAccountTransactions(int AccountNumber){
		StringBuffer buf = new StringBuffer();
		BankAccount NewAccount=(BankAccount) BankList.get(AccountNumber);
		buf.append("Account#" + AccountNumber + "transaction(s):\n");
		buf.append(NewAccount.getTransaction());
		buf.append("End of transaction\n");
		
		return buf.toString();
	}
	String summarizeAllAccounts(){
		StringBuffer buf = new StringBuffer();
		buf.append("Account: Balance: Transaction: Status:");
		for (BankAccount bank: BankList.values()){
			buf.append(bank.accountNumber +" ");
			buf.append(bank.getBalance() +"	");
			buf.append(bank.sumtransactionnumber()+" ");
			buf.append(bank.State+" ");
		}
		buf.append("End of Summary");
		return buf.toString();
	}
	void reOpenAcccount(int AccountNumber){
		BankAccount NewAccount=(BankAccount) BankList.get(AccountNumber);
        NewAccount.reOpen();
	}
	void CloseAcccount(int AccountNumber){
		BankAccount NewAccount=(BankAccount) BankList.get(AccountNumber);
        NewAccount.close();
	}
	void suspendAcccount(int AccountNumber){
		BankAccount NewAccount=(BankAccount) BankList.get(AccountNumber);
        NewAccount.suspend();
	}
}
