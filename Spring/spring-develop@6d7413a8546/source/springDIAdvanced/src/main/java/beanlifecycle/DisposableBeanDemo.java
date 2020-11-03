package beanlifecycle;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DisposableBeanDemo  {

    public static void main(String[] args) {
    	ConfigurableListableBeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/beanlifecycle-context.xml"));

	    SimpleBeanIB simpleIB1 = (SimpleBeanIB) factory.getBean("simpleIB1");
	    System.out.println(simpleIB1.toString());
	    factory.destroySingletons();
    }


}