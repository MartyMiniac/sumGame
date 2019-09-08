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
		th ob = new th();
		Scanner in = new Scanner(System.in);
		int a=(int)(Math.random()*201)-100,b=(int)(Math.random()*201)-100,c=0,d=0;
		System.out.print(a);
		if(b<0)
			System.out.print(b+"=");
		else
			System.out.print("+"+b+"=");
		ob.start();
		c=in.nextInt();
		d=a+b;
		if(c==d)
			System.out.println("You Won !! You took "+((double)time/10.0)+" Secs");
		else
			System.out.println("You Lose !! For answering you took "+((double)time/10.0)+"\nBut the correct answer is "+d);
		ob.stop();
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