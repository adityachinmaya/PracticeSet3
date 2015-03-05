package Set3;
import java.util.Date;
import Set3.InsufficientFundsException;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	//no arg constructor. Problem states default should be 0
	public Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	
	
	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}

	//setter and getter for id
	public int getId() {
		return id; }
	public void setId(int newId) {
		id = newId; }
	
	//setter & getter for Balance
	public double getBalance() {
		return balance; }
	public void setBalance(double newBalance) {
		balance = newBalance; }

	//setter & getter for Annual Interest Rate
	public double getAnnualInterestRate() {
		return annualInterestRate; }
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate; }

	//accessor method for for dateCreated
	public void setDateCreated(Date newDateCreated){
		dateCreated = newDateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return (annualInterestRate)/12 ; 
	}
	
	public double withdraw(double AmountTaken) throws InsufficientFundsException
	{
		double BalanceWithdrawn;
		if(getBalance() >= AmountTaken)
		{
			BalanceWithdrawn = (getBalance() - AmountTaken); 
			setBalance(BalanceWithdrawn);
			return(getBalance());
		}
		else {
			double missing = AmountTaken - getBalance();
			throw new InsufficientFundsException (missing);
		}
		
	}
	
	public double deposit(double amount){
		//deposit a specified amount into the account
		return balance = balance + amount;
	}
	
}
