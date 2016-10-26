import java.util.Scanner;


public class CollatzFolge {

	static double number = 0;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scan = new Scanner( System.in );

		    System.out.print("Gib mir eine Zahl: ");
		    number= scan.nextDouble();
     
		while(number>1){
		   if(number % 2==0){
			    number=number/ 2;}
		     else{
			    number=number*3 +1;};
			   
		System.out.println(number);	   
		}
		
		  
		
	}

}
