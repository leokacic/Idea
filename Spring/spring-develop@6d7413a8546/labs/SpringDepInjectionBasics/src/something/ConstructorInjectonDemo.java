package something;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ConstructorInjectonDemo {

	public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/something-context.xml"));

        ConstructorInjection ci = (ConstructorInjection)factory.getBean("constructorInjection");
        
        System.out.println(ci);
     
        SetterInjection si = (SetterInjection)factory.getBean("setterInjection");
        System.out.println(si);
	}

}
