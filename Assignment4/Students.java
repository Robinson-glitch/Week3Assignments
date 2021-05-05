package Assignment4;

public class Students {
	
	//getStudentInfo()
	
	public   void GetstudentInfo(int id){
		
		System.out.println("The id is " +id);
		
	}
	
	public  void GetstudentInfo(int id, String name) {
		
		System.out.println("The id iss" +id);
		System.out.println("The name is" +name);
	}
	
	public  void GetstudentInfo(String email, long Phonenumber) {
		
		System.out.println("The email id is" +email);
		System.out.println("The Phone number"+Phonenumber);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.GetstudentInfo(111);
		obj.GetstudentInfo(111,"Robinson");
		obj.GetstudentInfo("mariarobin895@gmail.com",1234567890);
		
		
		
	
			
		}
	}


