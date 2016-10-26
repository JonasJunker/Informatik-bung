package animationGame;

public class Vertex {

	//Attribute
	public double x; 
	public double y;
	private String setX;
	
	//Konstruktor
	public Vertex(double x, double y){
	
		this.x=x;
		this.y=y;
		
	}
	
	public double distance(Vertex v2){
		double xx=v2.x-this.x;
		double yy=v2.y-this.y;
		
		return Math.sqrt(xx*xx+yy*yy);
		
	}
	
	 public Vertex normalized (Vertex v2){
		 
		double teiler= v2.length();
		 
		 Vertex normalizedvertex= new Vertex(v2.x/teiler, v2.y/teiler);
		 return normalizedvertex;
	 }

	 public String toString() {
		 return "("+x+", "+y+")";}
	 
	 public double length() { 
		 return Math.sqrt(x*x+y*y);}
	 
	 public Vertex skalarMult(double s){
		 return new Vertex (x*s, y*s); }
	 
	 public Vertex add(Vertex v5) {
		 return new Vertex(x+v5.x,y+v5.y);}
	 public Vertex sub(Vertex v5) {
		 return new Vertex(x-v5.x,y-v5.y);}
	 
	 public void addMod (Vertex v5) {
		 x=x+v5.x;
		 y=y+v5.y; } 
	 
	 public void skalarMultMod(Vertex v5) {
		  x=v5.x+x;
		  y=v5.y+y;}
	 public void setzeX(double xx) {
	    x=xx;}
	 
	 public void setX(double x){
	    this.x = x;}
	 public void setY(double y) {
		 this.y = y;}
	 
	 
	 public double getX() {return x;}
	 public double gety() {return y;}
	 
	 
	 public boolean equals(Object thatObject){
		 if(thatObject instanceof Vertex) {
			 Vertex that = (Vertex)thatObject;
			 return this.x==that.x && this.y==that.y;
		 }
		 return false;
		 
		 }
	 
	 }
	 
	 


