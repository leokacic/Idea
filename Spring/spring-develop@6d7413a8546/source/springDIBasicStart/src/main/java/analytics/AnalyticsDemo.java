package analytics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class AnalyticsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/helloworld-context.xml"));

        // hello1 is beanId in beans.xml for class analytics.Hello1
        IAnalyticsHelloWorld hello = (IAnalyticsHelloWorld)factory.getBean("hello1");

        System.out.println(hello);
        
        IAnalyticsHelloWorld hello1 = (IAnalyticsHelloWorld)factory.getBean("hello1");
        
        System.out.println(hello1);
        
        
//        hello.sayHello();
//        Hello1 hello1 = (Hello1)factory.getBean("hello1");

	}

}
