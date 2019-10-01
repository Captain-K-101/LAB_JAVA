
public class Driver {
try{
	public static void main(String[] args) {
		Point p = new Point();
	      p.setX(2);
	      p.setY(3);
	      System.out.println("(" + p.getX() + "," + p.getY() + ")");
	      p.print();
	      
	      Point p2 = new Point();
		  p2.setX(2);
	      p2.setY(3);

		  if (p == p2)	
				System.out.println("Same");	// This line will never be executed
			else
				System.out.println("Different"); // This line is always executed
		  
		  System.out.println(p);
	}catch(IOException e){
	System.out.println(e);
	}catch(SQLException e){
	System.out.println(e);
	}catch(Error e){
	System.out.println(e);
	}
	}

}
