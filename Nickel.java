public class Nickel extends ACoin{
	public Nickel(){
		
		
		this.setVolume(2.12, 0.176);
	}
	public void deposit(int number){
		this.depositAmount(0.05*number);		
	}
	
	public void setCountry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCurrencyType() {
		// TODO Auto-generated method stub
		
	}
}