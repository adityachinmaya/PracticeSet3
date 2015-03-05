package Set3;

public class InsufficientFundsException extends Exception {

	private double amount;

	private double AmountTaken = 0;


	public InsufficientFundsException(double AmountNeeded) {
		this.AmountTaken = AmountNeeded;
	}

	public double getAmountNeeded(){
		return AmountTaken;
	}
}

