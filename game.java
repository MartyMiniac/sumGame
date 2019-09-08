import java.util.*;
class game
{
	static int time;
	game()
	{
		time=0;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a=(int)(Math.random()*101),b=(int)(Math.random()*101),c=0,d=0;
		System.out.print(a+"+"+b+"=");
		c=in.nextLine();
		d=a+b;
		if(c==d)
			System.out.print("You Won !! You took "+((double)time/10.0)+" Secs");
		else
			System.out.print("You Lose !! For answering you took "+((double)time/10.0)+"\n But the correct answer is "+d);
	}
}
class th extends Thread
{
	public void run()
	{
		game ob = new game();
		while(true)
		{
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e){}
			ob.time++;
		}
	}
}