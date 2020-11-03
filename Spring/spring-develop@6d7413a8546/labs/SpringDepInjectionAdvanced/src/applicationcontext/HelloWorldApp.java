package applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext  ctx = new ClassPathXmlApplicationContext(
        						"/META-INF/spring/helloworld-context.xml");
		
        HelloWorld hello = (HelloWorld)ctx.getBean("helloWorld");
        hello.sayHello();
	}

}
