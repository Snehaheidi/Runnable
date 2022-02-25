
public class Runnable_Main {

	public static void main(String[] args) throws InterruptedException 
	{
		// Runnable --> new object create  
		Run_Func Run = new Run_Func();
		Thread thread = new Thread(Run);
		thread.start();
		if(thread.isAlive())
		{
			System.out.println("Rnning the Process...");
		}
		
		System.out.println("");
		thread.join();
		System.out.println("Thrad_1 finished...");
		System.out.println(" ");
		Example example = new Example();
		example.start();
		example.join();
		System.out.println("Thrad_2 finished...");
		System.out.println(" ");
		Runnable Num = () ->   // Lamda Function  ---> new Runnable() --> ()->  
		{
			for(int i=0;i<2;i++)
			{
				System.out.println("Runnable lamda function...!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};	
		Thread t1= new Thread(Num);
		//t1.setPriority(10);  // Max Priority
		//System.out.println(t1.getPriority());
		t1.start();
		t1.join();
		System.out.println("Thrad_3 finished...");
		System.out.println(" ");
		t1.setName("Lamda");
		System.out.println(t1.getName());
		System.out.println("Successfully Finished...");
	}
}

