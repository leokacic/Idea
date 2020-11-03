import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * XML vs Java spring configuration example.
 */
public class HelloWorldDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		// example using XmlBeanFactory, which is deprecated now
//      BeanFactory factory = new XmlBeanFactory(new ClassPathResource("/META-INF/spring/helloworld-context.xml"));
//		IHelloWorld hello = (IHelloWorld)factory.getBean("helloWorld");
//		hello.sayHello();

		// app. context from XML file
		ApplicationContext xmlContext = new ClassPathXmlApplicationContext("/META-INF/spring/helloworld-context.xml");
		IHelloWorld hello = (IHelloWorld)xmlContext.getBean("helloWorld");
		hello.sayHello();

		IHelloWorld hello1 = (IHelloWorld)xmlContext.getBean("helloWorld");
		hello1.sayHello();

		// app. context from Java config class
		ApplicationContext javaContext = new AnnotationConfigApplicationContext(HelloWorldJavaConfig.class);
		IHelloWorld hello2 = (IHelloWorld) javaContext.getBean("helloWorld");
		hello2.sayHello();

		// give me another bean from xmlContext
		IHelloWorld hello3 = (IHelloWorld)xmlContext.getBean("helloWorld");
		hello3.sayHello();

	}

}
