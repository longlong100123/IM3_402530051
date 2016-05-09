import java.util.ArrayList;

public class BankAccount {
  public int accountNumber;
  private double balance;
  public String State;
  
private ArrayList<Double> transactionList;

  public BankAccount(){
	  this(-1,-1);
  }
  
  public BankAccount(int anAccountNumber){
	  accountNumber= anAccountNumber;
	  balance = 0;
  }
  
  public BankAccount(int anAccountNumber, double initalBalance){
	  this.accountNumber= anAccountNumber;
	  this.balance= initalBalance;
	  this.transactionList= new ArrayList<Double>();
	  this.State="open";
  }
  
  public int getAccountNumber(){
	  return this.accountNumber;
  }
  public double getBalance(){
	  return this.balance;
  }
  
  public void deposit(double amount){
	  if (isOpen()){
		  this.balance=this.balance + amount;
		  addTransaction(amount);
	  	  }
  }
  
  public void withdraw(double amount){
	  if (isOpen() && balance<amount){
	  this.balance-= amount;
	  addTransaction(amount);
	  }
	  else {			  
		  }
	  }
  
  public void suspend(){
	  this.State="suspended";
	  
  }
  
  public void close(){
	  this.State="closed";
  }
  
  public void reOpen(){
	  this.State="opened";
  }
  public boolean isOpen(){
	  return this.State.equalsIgnoreCase("open");
  }
  
  public boolean isClosed(){
	  return this.State.equalsIgnoreCase("closed");
  }
  public boolean isSuspended(){
	  return this.State.equalsIgnoreCase("suspended");
  }
  public void addTransaction(double amount){
	  this.transactionList.add(amount);
  }  
  public String getTransaction(){
	  String result=null;
	  for (int i=0;i<this.transactionList.size();i++){
		  result= result + (i+1) +":"+this.transactionList.get(i)+"\n";
  }
	  return result;
}
  public int sumtransactionnumber(){
	  return this.transactionList.size();
  }
}
