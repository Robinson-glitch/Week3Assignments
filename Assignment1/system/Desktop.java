package org.system;

public class Desktop extends Computer 
{
	
	public void desktopSize(int f1)
	
	{
		System.out.println("The desktop size "+f1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop obj= new Desktop();
		
		obj.computerModel("Inspiron");
		
		obj.desktopSize(48);
			
		}

	}


