// Thread function --> using synchronized --> extends use
public class Example extends Thread
{
	synchronized public void run() {
		for(int i=0;i<2;i++)
		{
			System.out.println("Good Morning...!");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {

				e.printStackTrace();
			}
		}	
	}
}
