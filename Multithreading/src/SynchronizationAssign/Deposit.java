package SynchronizationAssign;

public class Deposit {

	public Deposit(Account a,float amount)
	{
		float temp;
		temp = a.bal;
		temp = temp + amount;
		a.bal = temp;
	}
}
