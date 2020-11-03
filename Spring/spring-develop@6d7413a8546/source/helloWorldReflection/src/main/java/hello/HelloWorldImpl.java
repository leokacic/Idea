package hello;

public class HelloWorldImpl implements IHelloWorld {

	private String value = "xxx";
	
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
