
public class SampleConstructor {
	
	SampleConstructor(){
		System.out.println("Hi Constructor");
	}
	
	SampleConstructor(int a){
		System.out.println("Hi argument constructor :"+a);
		
	}
	void sample(){
		System.out.println("Hi method");
	}
	
	public static void main(String[] args){
//		new SampleConstructor();
		new SampleConstructor(12);
	}

}
