import java.util.Scanner;

public class StringinaString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter main string");
		String s1 = scan.nextLine();
		System.out.println("enter sub string");
        String s2 = scan.nextLine();
 
        int res = isSubstring(s2, s1);
 
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println(
                "Present at index "
                + res);
    }
	static int isSubstring(
	        String s2, String s1)
	    {
	        int M = s2.length();
	        int N = s1.length();
	 
	       
	        for (int i = 0; i <= N - M; i++) {
	            int j;
	            for (j = 0; j < M; j++)
	                if (s1.charAt(i + j)
	                    != s2.charAt(j))
	                    break;
	 
	            if (j == M)
	                return i;
	        }
	 
	        return -1;
	    }

}
