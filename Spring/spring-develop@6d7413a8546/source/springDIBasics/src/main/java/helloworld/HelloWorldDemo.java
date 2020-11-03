package helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloWorldDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		HelloWorld h = new HelloWorldImpl();
//		((HelloWorldImpl)h).setHello("iyi günler");
//		h.sayHello();
		
        BeanFactory factory = new XmlBeanFactory(
        						new ClassPathResource("/META-INF/spring/helloworld-context.xml"));

        
        HelloWorld hello = (HelloWorld)factory.getBean("helloWorld");
        hello.sayHello();
        System.out.println(hello);
        
        HelloWorld helloSecond = (HelloWorld)factory.getBean("helloWorld");
        System.out.println(helloSecond);
        
        helloSecond.sayHello();
        
//        HelloWorld hello1 = (HelloWorld)factory.getBean("helloWorld");
//        System.out.println(hello1);
//
//        
//        HelloWorld hw = new HelloWorldImpl();
//        ((HelloWorldImpl)hw).setHello("Dobar dan");
//        hw.sayHello();
	}

}
