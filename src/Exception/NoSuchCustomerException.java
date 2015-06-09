package Exception;

public class NoSuchCustomerException extends Exception
{
	private int custNo;
	public NoSuchCustomerException(int custNo)
	{
		this.custNo = custNo;
		System.out.println("The customer " +custNo + "doesn't exist.");
	}
	//public int getCustomerNumber()
	{
	//	return custNo;
	}
		
}


