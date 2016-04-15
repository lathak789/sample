
public class ArraysSample {

	public static void main(String[] args) {

		int a = 10;

		// Array is a collection of same data type of elements, Arrays are fixed
		// in size
		int[] ar = new int[3];
		ar[0] = 1;
		ar[1] = 2;
		ar[2] = 3;

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		char[] ch = { 'a', 'b', 'c' };

		for (char c : ch) {
			System.out.println(c);
		}

		System.out.println(ar[2]);

		int[] array1 = { 2, 3, 5, 4 };

		for (int b : array1) {
			System.out.println(b);
		}

		String[] str = new String[3];
		str[0] = "Hi";
		str[1] = "Hello";
		str[2] = "World";

		System.out.println(str[2]);
		System.out.println(str.length);
	}

}
