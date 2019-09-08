import java.util.*;
class game
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a=(int)(Math.random()*101),b=(int)(Math.random()*101),c=0,d=0;
		System.out.print(a+"+"+b+"=");
		c=in.nextLine();
		d=a+b;
		if(c==d)
			System.out.print("You Won !!");
		else
			System.out.print("You Lose !! The answer is "+d);
	}
}