
public class WhyMethod {
	public static void main(String[] args) {
		
		printTwoTimes("A", "-");	// argument
		printTwoTimes("B", "*");
		printTwoTimes("C", "&");
	}
	// parameter
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
