
public class Point {
	private int x;  
	private int y; 
	
	void Point(){
	this.x=0;
	this.y=0;
	}
	public void setX(int xCoord) {
	    this.x = xCoord;    
	  } 
	
	public void setY(int yCoord) {
	    this.y = yCoord;
	}

	public int getX() {
	        return this.x;
	      }

	public int getY() {
	        return this.y;
	      }
	public void print() {
	      System.out.println("(" + this.x + "," + this.y + ")");
	    }

}
