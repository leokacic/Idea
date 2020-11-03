package hello;

public class CreateObjectClassicalWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IHelloWorld hello = new HelloWorldImpl();
		hello.sayHello();
	}

}
