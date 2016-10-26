import java.util.Scanner;


public class Fistbuzz {
	
	 public static double n=0;
			 
	public static void main(String[] args){
		
		Scanner scan = new Scanner( System.in );

	    System.out.print("Gib mir eine Zahl: ");
	    n= scan.nextDouble();
		
		if(n%3==0||n%5==0){
			
		if(n%3==0){
			System.out.print("Fizz");
		}
		if (n%5==0) {
				System.out.print("Buzz");	
			}
		}
		else {
			System.out.print("Die Zahl ist nicht durch 5 und/oder 3 teilbar. Sie war: ");
			System.out.print(n);
		
		}
		
 




		}

	}






