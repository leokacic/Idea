package something;

public class SomethingImpl implements ISomething {

	private String message;
	private int age;
	
	public void doSomething() {
		System.out.println(getMessage());
		System.out.println(age);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
