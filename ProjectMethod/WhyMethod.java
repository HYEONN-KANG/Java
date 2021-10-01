
public class WhyMethod {
	public static void main(String[] args) {
		
		System.out.println(twoTimes("a", "-"));
		printTwoTimes("B", "*");
		printTwoTimes("C", "&");
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	// parameter
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
