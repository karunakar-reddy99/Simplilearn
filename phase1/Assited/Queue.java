import java.util.LinkedList;
import java.util.Queue;

public class AboutQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(5);
		q.add(6);
		q.add(96);
		q.add(54);
		q.add(32);
		System.out.println();
		q.remove(54);
		q.add(35);
		System.out.println(q);
		
	}

}
