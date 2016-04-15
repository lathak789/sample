
public class SampleInterfaceImplementation implements SampleInterface, SampleInterfaceTwo{

	@Override
	public void engine() {
		System.out.println(" New Engine");
	}

	@Override
	public void start() {
		
	}
	
	void gear(){
		System.out.println("Five Gears");
	}

}
