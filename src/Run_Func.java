// Runnable interface -->  implemnts use pannanum
public class Run_Func implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<2;i++)
		{
			System.out.println("Hello Friends...!");
			try {
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) {

				e.printStackTrace();
			}
		}	
	}

}
