package animationGame;

public class FibonacciFolge {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       long x1= 0;
       long x2= 1;
       long x3= 0;
       long reihe =2;
       
       System.out.println(". Fibonacci zahl ist: " +x1);
       System.out.println(". Fibonacci zahl ist: " +x2);
       
       while(x3<=400){ 
    	   x3= x1+x2;
    	   x1= x2;
    	   x2=x3;
    	   
    	   reihe++;
    	   System.out.println(reihe+ ". Fibonacci zahl ist= " +x3);
       }
       
       
	

	}

}
