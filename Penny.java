public class Penny extends ACoin {
	public Penny(){	
		
		
		this.setVolume(1.905, 0.145);
	}
	public void deposit(int number){
		//this.depositAmount(this.getAmount()+0.01*number);	
		this.depositAmount(0.01*number);
	}
	
	

	public void setCountry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCurrencyType() {
		// TODO Auto-generated method stub
		
	}
}