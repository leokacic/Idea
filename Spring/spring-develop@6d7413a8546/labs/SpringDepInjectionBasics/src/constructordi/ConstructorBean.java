package constructordi;

public class ConstructorBean {
	
	private String valueToInject;
	private String secondArg;
	
	public ConstructorBean(String valueToInject, String secondArg){
		this.valueToInject = valueToInject;
		this.secondArg = secondArg;
	}

	public String getValueToInject() {
		return valueToInject;
	}

	public String getSecondArg() {
		return secondArg;
	}

	
}

