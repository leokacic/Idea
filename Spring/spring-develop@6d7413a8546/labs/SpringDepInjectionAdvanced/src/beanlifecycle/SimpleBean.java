package beanlifecycle;

public class SimpleBean {

	private static final String DEFAULT_NAME = "D Star";
	private String name;
	private int age = 0;
	
	public void init() {
		System.out.println("initializing bean");
		if (this.name == null) {
			System.out.println("No name specified, using default.");
			this.name = DEFAULT_NAME;
		}
	}
	
	public void destroy() {
		System.out.println("destroy bean");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("SimpleBean");
		sb.append("{name='").append(name).append('\'');
		sb.append(", age=").append(age);
		sb.append('}');
		return sb.toString();
	}
	
}
