public class Quarter extends ACoin{
	public Quarter(){
		
		
		this.setVolume(2.388, 0.158);
	}
	public void deposit(int number){
		this.depositAmount(0.25*number);		
	}
	
	@Override
	public void setCountry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCurrencyType() {
		// TODO Auto-generated method stub
		
	}
}