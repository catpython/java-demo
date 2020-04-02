public class Toonie extends ACoin{
	public Toonie(){
		
		
		this.setVolume(2.8, 0.18);
	}
	public void deposit(int number){
		this.depositAmount(2*number);		
	}
	
	public void setCountry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCurrencyType() {
		// TODO Auto-generated method stub
		
	}
}