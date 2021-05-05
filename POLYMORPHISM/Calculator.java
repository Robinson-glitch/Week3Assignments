package POLYMORPHISM;

public class Calculator {

	int result;
	double result1;
	
	// 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
	 //- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
	// - 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
	// - 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int	
	
	public void Add(int a,int b) {
		
		result= a+b;
		
		System.out.println("The Addition of 2 numbers is "+result);
		
	}
	
	public void Add(int a, int b, int c) {
		
		result = a+b+c;
		System.out.println("The Addition of 3 numbers is "+result);
		
	}
	
	public void Subtract(int a1, int b1) {
		
		
		result= a1-b1;
		System.out.println("The Addition of 3 numbers is "+result);
	}
	
	public void Subtract(double a1, double b1) {
		
		result1=a1-b1;
		System.out.println("The Subtraction of 2 numbers is "+result1);
		
		
	}
	
	public double Division(int a2, int b2){
		
		result1=a2/b2;
		System.out.println("The division of 2 numbers is "+result1);
		return result1;
		
	
		
	}
	
	public void Division(double  a2 , int b2)
	
	{
	
		result1=a2/b2;
		System.out.println("The division of 2 numbers is"+result1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c= new Calculator();
		c.Add(1002323, 100);
		c.Add(10, 5, 21);
		c.Subtract(22, 13);
		c.Subtract(22.7, 10.5);
		c.Division(20, 100);
		c.Division(24.2, 2);

	}
	
		
	}



