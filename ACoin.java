public abstract class ACoin implements ICurrency{
	private String name;	
	private String country;
	private String currencyType;
	
	private double diameter;
	private double thickness;
	
	private double coinVolume=0;
	private double coinsAmount=0.00;

	private int coinsNumber=0;

	public String getName(){return name;}
	public void setName(String cName){
		name= cName;
	}

	public String getCurrencyType(){return currencyType;}
	public void setCurrencyType(String cType){
		currencyType= cType;
	}

	public String getCountry(){return country;}
	public void setCountry(String cCountry){
		country = cCountry;
	}


	public double getAmount(){		
		System.out.println("ACoin getAmount is "+ coinsAmount);
		return coinsAmount;
	}
	public void depositAmount(double amount){
		coinsAmount+=amount;
		}
	public void setAmount(double amount){
		coinsAmount=amount;
		//System.out.println("ACoin set coinsAmount is "+ coinsAmount);
		}
	


	public double getVolume(){
		double coinsTotalVol=0;
		coinsTotalVol = coinVolume *coinsNumber;
		System.out.println("ACoin getVolume is "+ coinsTotalVol);
		return coinsTotalVol ;
	}
	public void setVolume(double diam, double thick){
		diameter=diam;
		thickness=thick;
		coinVolume= Math.PI * diameter /2 * diameter /2 * thickness;
	}
	public double getSupposedAddedVolume(int num){
		double coinsSAV=0;
		coinsSAV = coinVolume *num;
		System.out.println("ACoin getSupposedVolume is "+ coinsSAV +" = "+coinVolume+" x "+ num);
		return coinsSAV ;
	}
	

	public int getNumber(){return coinsNumber;}
	public void addNumber(int cNumber){
		coinsNumber+= cNumber;
	}
	public void setNumber(int cNumber){
		coinsNumber= cNumber;
	}
	
	
	
	
	public abstract void deposit(int number);	
	
}