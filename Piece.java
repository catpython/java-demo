public class Piece extends ACoin{
	public Piece(){	
	
		
		this.setVolume(2.713, 0.195);
	}
	public void deposit(int number){
		this.depositAmount(0.5*number);		
	}
	
	public void setCountry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCurrencyType() {
		// TODO Auto-generated method stub
		
	}
}