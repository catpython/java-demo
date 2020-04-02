public interface ICurrency{
	
	
	public String getCountry();
	public void setCountry();
	
	public String getCurrencyType();
	public void setCurrencyType();
	
	public double getAmount();
	public void setAmount(double amount);
	public void depositAmount(double amount);
	
	
	public int getNumber();
	public void addNumber(int cNumber);
	public void setNumber(int cNumber);

	public void deposit(int number);
	
	
	
} 