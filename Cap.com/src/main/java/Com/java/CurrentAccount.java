package Com.java;

public abstract class CurrentAccount extends PersonDetails implements bank{
    private int accNo;
    private int balance;
	public CurrentAccount(String name, String city, int accNo, int balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
   @Override
	public String toString() {
		return "CurrentAccount [accNo=" + accNo + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
public void deposit( float amount) {
	   if (amount > DepositLimit) {
		   System.out.println("Entered amount is greater than depositlimit");
	   }
	   else {
		   balance+=amount;
		   System.out.println("Rs."+amount+"was deposited");
	   }
   }
   public void wihtdraw( float amount) {
	   if (amount <= balance-MinBal) {
		   System.out.println("Rs."+amount+"was withrawn");
	   }
	   else {
		   System.out.println("Insufficient balance ");
	   }
   }
}
   
	
    

