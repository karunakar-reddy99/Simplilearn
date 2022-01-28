public class AboutRunnable extends Thread{

	public static void main(String[] args) {
		new Thread(new Regrunnable()).start();
System.out.println(Thread.currentThread().getName() + "  thread running");
	}

}
class Regrunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "   running...");
}
}
