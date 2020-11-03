package injectbean;

import injectcollections.Dependency;

public class InjectBean {

	private Dependency dependency;

	public Dependency getDependency() {
		return dependency;
	}

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}
	
	private String testRefValue;

	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setTestRefValue(String testRefValue) {
		this.testRefValue = testRefValue;
	}
	
	public void print() {
		
		System.out.println(testRefValue);
	}
	
	
}
