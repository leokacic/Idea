package beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SimpleBeanIB implements InitializingBean, DisposableBean {

	private static final String DEFAULT_NAME = "D Star";
	private String name;
	private int age = 0;
	
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
		sb.append("SimpleBeanIB");
		sb.append("{name='").append(name).append('\'');
		sb.append(", age=").append(age);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing bean");
		if (this.name == null) {
			System.out.println("No name specified, using default.");
			this.name = DEFAULT_NAME;
		}
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Bean");
	}
	
}
