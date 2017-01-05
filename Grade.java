import java.io.*;
class Grade
{
	public static void main(String[] args) 
	{
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks:");
		a = s.nextInt();
		if(a>=90)
		{
			System.out.println("Grade is A");
		}
		else if(a>=80)
		{
			System.out.println("Grade is B");
		}
		else if(a>=70)
		{
			System.out.println("Grade is C");
		}
		else if(a>=60)
		{
			System.out.println("Grade is D");
		}
		else
		{
			System.out.println("Grade is F");
		}
	}
}