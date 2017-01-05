import java.io.*;
class Seq
{
	public static void main(String[] args)
	{
		int i=3;
		System.out.println(i);
		for(int r=3;r<127; )
		{
			r=(2*r)+1;
			r=r++;
			System.out.println(r);
		}
	}
}