
public class Test {
  
	static int number = 0;
	
	public static void main(String[] args){
	primAusgabe();
	System.out.println(addiere(1,2));
	System.out.println(sub(3,4));
	System.out.print(divi(16,16));
	System.out.println(multi(49,8));
		
		
	}
	
	private static int multi(int zahl7, int zahl8) {
		// TODO Auto-generated method stub
		return zahl7*zahl8;
	}
	private static int divi(int zahl5, int zahl6) {
		// TODO Auto-generated method stub
		return zahl5/zahl6;
	}
	
	private static int sub(int zahl3, int zahl4) {
		// TODO Auto-generated method stub
		return zahl3-zahl4;
	}
	
	private static int addiere(int zahl1, int zahl2) {
		// TODO Auto-generated method stub
		return zahl1+zahl2;
	}

	    public static void primAusgabe(){
		// TODO Auto-generated method stub
        int ausgabe=0;
		//System.out.println("Primzaheln sind: " );
		for(int i=2; i<=10000; i++){
			number=i;
		if(isPrime(number)==true){	
	   // System.out.print(i +", ");
	    ausgabe++;
	    if(ausgabe%20==0){
	    	//System.out.println("");
	    }
	   }
	  }	
	 }	
	     
	public static boolean isPrime(int number){
		  
		  if(number<2){return false;}
		  
		  for(int i=2; i<=number/2; i++){
			  if(number%i==0){
				  return false;}
		  }
   
		  return true;
		  
	
    }
		
 }

