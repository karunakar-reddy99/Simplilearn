public class WaitAndSleep extends Thread{

	public static void main(String[] args) {
		WaitAndSleep type1 = new WaitAndSleep();
		type1.setName("karunakar");
		type1.start();
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"  Thread Sleeping");
		try {
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+"    just woke up");
			wait();
		} catch (Exception e) {
			System.out.println("error occured"+e.getMessage());
		}	
	}

}
