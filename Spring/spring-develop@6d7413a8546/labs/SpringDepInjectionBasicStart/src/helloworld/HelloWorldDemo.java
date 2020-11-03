package helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloWorldDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		HelloWorld h = new SecondHelloWorldImpl();
		h.sayHello();
		*/
		
        BeanFactory factory = new XmlBeanFactory(
        						new ClassPathResource("/META-INF/spring/helloworld-context.xml"));

        HelloWorld hello = (HelloWorld)factory.getBean("helloWorld");
        hello.sayHello();
//        System.out.println(hello);

        HelloWorld hello1 = (HelloWorld)factory.getBean("helloWorld");
        //hello1.sayHello();
        System.out.println(hello1);

     //   HelloWorld shello = (HelloWorld)factory.getBean("secondHelloWorld");
     //   shello.sayHello();
        
        
       HelloWorld helloWorldJuly2011 = (HelloWorld)factory.getBean("helloWorldJuly2011");
       System.out.println(helloWorldJuly2011);
//       helloWorldJuly2011.sayHello();
       HelloWorld helloWorldJuly2011x = (HelloWorld)factory.getBean("helloWorldJuly2011");
       System.out.println(helloWorldJuly2011x);
        
	}

}
