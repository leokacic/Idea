package beanlifecycle;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DestroyMethodDemo  {

    public static void main(String[] args) {
    	ConfigurableListableBeanFactory factory = new XmlBeanFactory(
					new ClassPathResource("/META-INF/spring/beanlifecycle-context.xml"));

    	System.out.println("***********************");
        SimpleBean simple1 = (SimpleBean) factory.getBean("simple1");
        System.out.println(simple1.toString());
        factory.destroySingletons();
        

    }


}