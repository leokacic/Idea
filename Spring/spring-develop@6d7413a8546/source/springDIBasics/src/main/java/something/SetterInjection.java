package something;

import org.springframework.beans.factory.annotation.Autowired;


public class SetterInjection {
	
	@Autowired
	private Dependency dependency;

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}

	public Dependency getDependency() {
		return dependency;
	}
	
	
}
