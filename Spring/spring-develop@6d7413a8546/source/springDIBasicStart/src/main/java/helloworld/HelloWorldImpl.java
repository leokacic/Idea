package helloworld;

public class HelloWorldImpl implements HelloWorld {

	
	private String hello;
	private String secondHello;
	private MyType myType;
	


	public void sayHello() {
		System.out.println(hello);	
		System.out.println(secondHello);
		System.out.println(myType.getMyType());
	}


	public void setMyType(MyType myType) {
		this.myType = myType;
	}

	public void setSecondHello(String secondHello) {
		this.secondHello = secondHello;
	}


	public void setHello(String hello) {
		this.hello = hello;
	}

	

}
