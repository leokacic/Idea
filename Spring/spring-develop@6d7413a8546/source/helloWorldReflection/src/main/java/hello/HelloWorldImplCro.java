package hello;


public class HelloWorldImplCro implements IHelloWorld {

	private String value;
	
	public void sayHello() {
		System.out.println(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
