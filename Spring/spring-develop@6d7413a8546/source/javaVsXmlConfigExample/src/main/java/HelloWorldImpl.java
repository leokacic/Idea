/**
 * Concrete implementation of IHelloWorld interface.
 */
public class HelloWorldImpl implements IHelloWorld {

	/**
	 * a hello property
	 */
	private String hello = "hello from source code, should be overwritten";

	/**
	 * Say Hello to the World
	 */
	public void sayHello() {
		System.out.println(hello);
	}

	// Getters, Setters

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}
