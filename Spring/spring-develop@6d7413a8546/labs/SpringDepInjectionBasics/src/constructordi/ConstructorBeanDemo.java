package constructordi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ConstructorBeanDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/constructordi-context.xml"));

        ConstructorBean conBean = (ConstructorBean)factory.getBean("conBean");
        System.out.println(conBean.getValueToInject());
        
        System.out.println(conBean.getSecondArg());

	}

}
