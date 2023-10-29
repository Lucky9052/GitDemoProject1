import java.util.Scanner;

public class MaximunOfThree {
public static void main(String [] args) {
	int x,y,z;
	//creating object 
	Scanner sc= new Scanner(System.in);
	System.out.println(" Enter the First number");
	x=sc.nextInt();
	
	System.out.println(" Enter the Second number");
	y=sc.nextInt();
	
	System.out.println(" Enter the third number");
	z=sc.nextInt();
	
	if(x>y && x>z)
	{
		System.out.println("Maximum number:"+x);
		
	}
	else if(y>z)
	{
		System.out.println("Maximum number:"+y);
	}
	else
	{
		System.out.println("Maximum number:"+z);	
	}
	
	
	}
}