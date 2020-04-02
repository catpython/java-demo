import java.lang.String.*;
public class Application{
	
	public static void main(String[] agrs){
		System.out.println("Start!");
		PiggyBank bank1=new PiggyBank();
		double totalAmount;
		String ta;

		bank1.doDeposit("Penny", 2, "Canadian");
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		
		bank1.doDeposit("Nickel", 1, "Canadian");
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		
		bank1.doDeposit("Dime", 1, "Canadian");
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		
		bank1.doDeposit("Quarter", 1, "Canadian");	
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		
		bank1.doDeposit("Piece", 1, "Canadian");
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		
		bank1.doDeposit("Loonie", 1, "Canadian");
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		
		bank1.doDeposit("Toonie", 1, "Canadian");
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		
		bank1.doDeposit("Quarter", 1, "US");
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		
		bank1.doDeposit("Banknote", 1, "Canadian");
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		
	
		bank1.doDeposit("Toonie", 10, "Canadian");
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
	

		// After emptied the bank,reset to zero, show the balance and volume 
		System.out.println("Will Empty the bank!\n ");
		bank1.cleanBank();
		
		totalAmount= bank1.getTotalAmount();
		ta = String .format("%.2f", totalAmount); 
		System.out.println("Currently the total amount in bank is "+ta +"\n");
		double totalVolume = bank1.getTotalVolume();
		System.out.println("Currently the total Volume in bank is "+totalVolume);

	}
}