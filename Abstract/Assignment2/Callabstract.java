package Assignment3;

public class Callabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		University c= new College();
		String output=c.pg("BE");
		System.out.println("PG courses available "+output);
		c.ug();
        
	}

}

