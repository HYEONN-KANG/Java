
public class Greeting {
	
	public static void main(String[] args) {
		AccessLevelModifiersMethod.hi();
	}
}

class AccessLevelModifiersMethod {
    
	// public, protected, default, private
		public static void hi() {
			System.out.println("Hi");
		}
}