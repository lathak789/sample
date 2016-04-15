
public class Loops {

	public static void main(String[] args) {

		printNumbers(10);
		printNumbers(100);
		System.out.println("Hi this is new Address: A");
		System.out.println(" Hi this is  new street: A");
		System.out.println("Hi this is a new flat: A");

		System.out.println("Hi this is new Address: B");
		System.out.println(" Hi this is  new street: B");
		System.out.println("Hi this is a new flat: B");

		System.out.println("Hi this is new Address: C");
		System.out.println(" Hi this is  new street: C");
		System.out.println("Hi this is a new flat: C");

		userDetails("X");
		userDetails("y");
		userDetails("z");

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello" + i);
			System.out.println(i);
		}

		int j = 10;
		while (j < 5) {
			System.out.println("While Loop" + j);
			j++;
		}

		int k = 10;
		do {
			System.out.println("Do loop" + k);
			k++;
		} while (k < 5);

	}

	static void userDetails(String user) {
		System.out.println("Hi this is new Address: " + user);
		System.out.println(" Hi this is  new street: " + user);
		System.out.println("Hi this is a new flat: " + user);
	}

	static void printNumbers(int num) {
		for (int i = 1; i <= num; i++) {

			System.out.println("Hello" + i);
			System.out.println(i);
		}
		
	}
}
