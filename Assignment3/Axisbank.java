package Assignment3;

public class Axisbank extends BankInfo{

	
		// TODO Auto-generated method stub
		
		//deposit()
		
		public float deposit()
		{
			float depositamount=100000;
			return depositamount;
		
		}
		
	
		
		public static void main(String[] args) {
			
			Axisbank b1=new Axisbank();
			float result =b1.deposit();
			System.out.println(""+result);
			
			
			
	}

}
