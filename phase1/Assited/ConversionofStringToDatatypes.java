
import java.text.ParseException;

public class ConversionofStringToDatatypes {

	public static void main(String[] args) {
		String str = "656156";
		System.out.println("the to Long   is "+Long.parseLong(str));
		System.out.println(Long.valueOf(str));
	}
	class Main
	{
		public static int toInt(String str) {
			return Integer.parseInt(str);
		}

		public static Integer toInteger(String str) {
			return Integer.valueOf(str);
		}

		public static long tolong(String str) {
			return Long.parseLong(str);
		}

		public static Long toLong(String str) {
			return Long.valueOf(str);
		}

		public static double todouble(String str) {
			return Double.parseDouble(str);
		}

		public static Double toDouble(String str) {
			return Double.valueOf(str);
		}

		public static char[] toCharArray(String str) {
			return str.toCharArray();
		}

		public static byte[] toByteArray(String str) {
			return str.getBytes();
		}

		public static boolean toboolean(String str) {
			return Boolean.parseBoolean(str);
		}

		public static Boolean toBoolean(String str) {
			return Boolean.valueOf(str);
		}
}
}
