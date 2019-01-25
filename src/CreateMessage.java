
public class CreateMessage {
	static String message;

	public static void createMessage() {
		int a = 5;
		int b = 7;
		System.out.println("The sum of a+b is: " + addition(a, b));
	}

	public static int addition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		createMessage();
	}

}