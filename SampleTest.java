import java.nio.charset.spi.CharsetProvider;

public class SampleTest {

	int a;

	static double pi = 3.14;

	int method1(int a, int b) {
		int sum = a + b;
		return sum;
	}

	static HelloEclipse methodStatic() {
		System.out.println("Static method");
		return new HelloEclipse();
	}

	public static void main(String[] args) {
		SampleTest st = new SampleTest();
		methodStatic();
		int sum;
		sum = st.method1(5, 4);
		System.out.println(sum);

		System.out.println(st.method1(3, 5));

		SampleInner si = st.new SampleInner();

		si.methodInner();

	}

	class SampleInner {
		int x;
		int y;

		void methodInner() {
			System.out.println("Inner method");

		}
	}
}

class Sample1 extends SampleTest {

	public static void main(String[] args) {

		methodStatic();

	}

}