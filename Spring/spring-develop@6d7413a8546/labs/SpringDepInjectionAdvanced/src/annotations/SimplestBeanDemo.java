package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimplestBeanDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext(
        		"/META-INF/spring/annotation-context.xml");
        System.out.println(ac.getBean("simplestBean"));

	}

}
