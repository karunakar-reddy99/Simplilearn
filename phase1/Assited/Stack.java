import java.util.Stack;

public class AboutStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.add(5);
		st.add(9);
		st.add(8);
		st.add(4);
		System.out.println(st);
		st.remove(2);
		st.add(65);
		System.out.println(st);
		
	}		
}
