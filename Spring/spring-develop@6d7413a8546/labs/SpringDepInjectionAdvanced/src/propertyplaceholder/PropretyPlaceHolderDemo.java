package propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import applicationcontext.HelloWorld;

public class PropretyPlaceHolderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
        							 "/META-INF/spring/propertyplaceholderdemo-context.xml");
        
        HelloWorld hello = (HelloWorld)ctx.getBean("helloWorld");
        hello.sayHello();
	}

}
