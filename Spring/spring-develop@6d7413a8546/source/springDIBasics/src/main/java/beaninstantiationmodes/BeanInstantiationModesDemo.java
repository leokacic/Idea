package beaninstantiationmodes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanInstantiationModesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/beaninstantiationmodes-context.xml"));

        String singleMe = (String)factory.getBean("singleMe");
        String singleMe1 = (String)factory.getBean("singleMe");
        
        System.out.println("Bean singleMe=" + singleMe + ", singleMe1=" + singleMe1);
        System.out.println("SingleMe Same? " + (singleMe == singleMe1));
        
        String prototypeMe = (String)factory.getBean("prototypeMe");
        String prototypeMe1 = (String)factory.getBean("prototypeMe");
        
        System.out.println("PrototypeMe Same? " + (prototypeMe == prototypeMe1));

	}

}
