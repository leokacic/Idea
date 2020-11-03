package setterdi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SetterBeanDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/setterdi-context.xml"));

        SetterBean setterBean = (SetterBean)factory.getBean("setterBean");
        System.out.println(setterBean.getValueToInject());

        System.out.println(setterBean.getJosNesto());
        
	}

}
