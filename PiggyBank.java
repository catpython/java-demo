import java.util.ArrayList;
import java.lang.String.*;

public class PiggyBank{
         private double totalVolume;
         private double totalAmount;
         private double supposedVolume;
         private ArrayList<ACoin> carriers=new ArrayList<ACoin>();
         
         Penny Pennycoin =  new Penny();          
         Nickel Nickelcoin =  new Nickel();             
         Dime Dimecoin =  new Dime();          
         Quarter Quartercoin =  new Quarter();            
         Piece Piececoin =  new Piece();          
         Loonie Looniecoin =  new Loonie();	
         Toonie Tooniecoin =  new Toonie();   
         
         public PiggyBank(){
                           
	  
         carriers.add(Pennycoin);
         carriers.add(Nickelcoin);
         carriers.add(Dimecoin);
         carriers.add(Quartercoin);
         carriers.add(Piececoin);
         carriers.add(Looniecoin);
         carriers.add(Tooniecoin);
	
         }
         
   public void doDeposit(String coinsName, int number, String coinCountry){
	   supposedVolume=0.0;
	   System.out.println("Try to Deposit now...");
		
       if (coinCountry != "Canadian"){System.out.println("Unacceptable , Found Not Canadian Currency!");}
       else {	System.out.println("Piggy Bank is checking this Currency...");
     
       totalVolume=this.getTotalVolume();
       System.out.println("totalVolume is "+ totalVolume);
		
	    switch(coinsName)         {
        case "Penny":
        	System.out.println("Found Penny! ");
        	supposedVolume= totalVolume+Pennycoin.getSupposedAddedVolume(number);
    		System.out.println("supposedVolume is "+ supposedVolume);
    		if (supposedVolume <= 10){
    			Pennycoin.addNumber(number);
    			Pennycoin.deposit(number);
    		} 
    		else {System.out.println("supposed Volume is over 10cm^3 ! Will NOT Deposit");}
    	break;
        case "Nickel":
               		
               	System.out.println("Found Nickel");  
               	supposedVolume= totalVolume+Nickelcoin.getSupposedAddedVolume(number);
            	System.out.println("supposedVolume is "+ supposedVolume);
            	if (supposedVolume <= 10){
            		Nickelcoin.addNumber(number);
            		Nickelcoin.deposit(number);
            	} 
            	else {System.out.println("supposed Volume is over 10cm^3 ! Will NOT Deposit");}
        break;
        case "Dime":
             	
             System.out.println("Found Dime");
             supposedVolume= totalVolume+Dimecoin.getSupposedAddedVolume(number);
        	System.out.println("supposedVolume is "+ supposedVolume);
        	if (supposedVolume <= 10){
        		Dimecoin.addNumber(number);
        		Dimecoin.deposit(number);
        	} 
        	else {System.out.println("supposed Volume is over 10cm^3 ! Will NOT Deposit");}
               break;
           case "Quarter":
             		
        	   System.out.println("Found Quarter");
        	   supposedVolume= totalVolume+Quartercoin.getSupposedAddedVolume(number);
       		   System.out.println("supposedVolume is "+ supposedVolume);
       		   if (supposedVolume <= 10){
       			   Quartercoin.addNumber(number);
       			   Quartercoin.deposit(number);
       		   } 
       		   else {System.out.println("supposed Volume is over 10cm^3 ! Will NOT Deposit");}
              break;          
            case "Piece":
             		
             	System.out.println("Found Piece");
             	supposedVolume= totalVolume+Piececoin.getSupposedAddedVolume(number);
        		System.out.println("supposedVolume is "+ supposedVolume);
        		if (supposedVolume <= 10){
        			Piececoin.addNumber(number);
        			Piececoin.deposit(number);
        		} 
        		else {System.out.println("supposed Volume is over 10cm^3 ! Will NOT Deposit");}
              break;
            case "Loonie": 
	
            	System.out.println("Found Loonie");
            	supposedVolume= totalVolume+Looniecoin.getSupposedAddedVolume(number);
        		System.out.println("supposedVolume is "+ supposedVolume);
        		if (supposedVolume <= 10){
        			Looniecoin.addNumber(number);
        			Looniecoin.deposit(number);
        		} 
        		else {System.out.println("supposed Volume is over 10cm^3 ! Will NOT Deposit");}
			break;
            case "Toonie": 
		
            	System.out.println("Found Toonie");
            	supposedVolume= totalVolume+Tooniecoin.getSupposedAddedVolume(number);
        		System.out.println("supposedVolume is "+ supposedVolume);
        		if (supposedVolume <= 10){
        			Tooniecoin.addNumber(number);
        			Tooniecoin.deposit(number);
        		} 
        		else {System.out.println("supposed Volume is over 10cm^3 ! Will NOT Deposit");}
        	break;
            
            default:
    	System.out.println("Unacceptable Currency! Found Unrecognised Canadian Currency!");
            }  // end switch
		
		
     }//end if else  currency
}//end doDeposit method

	public double getTotalVolume(){
		totalVolume = 0.0;
		for(int i=0;i<carriers.size();i++)
		{       
			  ACoin icnext= (ACoin) carriers.get(i);
  
			totalVolume+=icnext.getVolume();
		}
		return totalVolume; 	
	}

	

	public  double getTotalAmount(){
		totalAmount = 0.00;
		//System.out.println(carriers.size()+" coin Types ");
		for(int i=0;i<carriers.size();i++)
		{       
			ACoin icnext= ( ACoin) carriers.get(i);
  
			totalAmount+=icnext.getAmount();
			
			String ta = String .format("%.2f", totalAmount); 
			System.out.println("PiggyBank Amount now is "+ta);
		}
		return totalAmount; 
	}

	public void cleanBank(){
		for(int i=0;i<carriers.size();i++)
		{       
			ACoin icnext= ( ACoin) carriers.get(i);
			System.out.println("PiggyBank cleanBank");
			icnext.setAmount(0.00);
			icnext.setNumber(0);
		}
	}

}