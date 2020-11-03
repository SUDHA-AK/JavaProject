package Package6;

import java.util.Random;

public class ThreadTask implements Runnable { 
	int a;
	public ThreadTask(int a){
	    this.a = a;
	}

	public void run()
	{
	    add(a);
	}

	public void add(int a)
	{
	    Random rand = new Random();
	    int  n = rand.nextInt(10) + 1;
	    System.out.println("number generated:" + n);
	    	a= a+n;
	    System.out.println(a);
	}
	

	
public static void main(String[] args)
{
    int sum= 0;
    ThreadTask sum1 = new ThreadTask(sum);
    Thread t1 = new Thread(sum1);
    Thread t2 = new Thread(sum1);
    Thread t3 = new Thread(sum1);
    Thread t4 = new Thread(sum1);
    Thread t5 = new Thread(sum1);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    
    }
}