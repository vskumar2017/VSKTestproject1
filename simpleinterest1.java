package SamplePrograms1;

public class simpleinterest1 {
	public static void main(String args[])
	{
		float p,n,r,si;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the principle");
		p=s.nextFloat();
		System.out.println("enter the rate of interest");
		r=s.nextFloat();
		System.out.println("enter the time period");
		n=s.nextFloat();
		si=(p*n*r)/100;
		System.out.println("the simple interest is"+si);
		
	}
}
