package beanlifecycle;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class LoggingBeanDemo  {

    public static void main(String[] args) {
    	ConfigurableListableBeanFactory factory = new XmlBeanFactory(
					new ClassPathResource("/META-INF/spring/beanlifecycle-context.xml"));

    	LoggingBean lb = (LoggingBean)factory.getBean("logging2");
    	lb.run();        

    }


}