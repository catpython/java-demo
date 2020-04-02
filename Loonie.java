public class Loonie extends ACoin{
	public Loonie(){
		
		
		this.setVolume(2.65, 0.175);
	}
	public void deposit(int number){
		this.depositAmount(1*number);		
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