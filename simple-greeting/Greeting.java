import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String who = scanner.next();
		System.out.printf("Hello %s\n", who);
	}
}
