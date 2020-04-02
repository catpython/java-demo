public class Dime extends ACoin{
	public Dime(){
		
		
		this.setVolume(1.803, 0.122);
	}
	public void deposit(int number){
		this.depositAmount(0.1*number);		
	}
	
	public void setCountry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCurrencyType() {
		// TODO Auto-generated method stub
		
	}
}