package animationGame;

public class TestVertex {

	Vertex v1 = new Vertex (15,76);
	Vertex v2 = new Vertex(0,0);
	Vertex v3 = new Vertex(44,22);
	Vertex v4 = new Vertex(55,33);
	Vertex v5 = v1.skalarMult(2);
			
	System.out.println(v1.equalsv(2));
	v2.setX(15);
	v2.setY(76);
	System.out.println(v1.equals(v2));
	
	System.out.println("v1.x=" +v1.x );
	System.out.println("v2.x=" +v2.x );
	System.out.println("v3.y=" +v3.y);
	System.out.println("v4.y=" +v4.y);
	System.out.println("v5=" +v5);
	
	System.out.println("v1 "+v1);
	System.out.println("v2" +v2);
	System.out.println("v3" +v3);
	System.out.println("v4" +v4);
	System.out.println(v1.length());
	System.out.println(v2.length());
	System.out.println("v1.getX= "+v1.getX());
	
	
	
       }

	 
	 }

