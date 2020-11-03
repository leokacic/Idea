package injectbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InjectBeanFromSameFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/injectbeanfromsamefactory-context.xml"));

        InjectBean injectBean = (InjectBean)factory.getBean("injectBean");
        System.out.println(injectBean.getDependency().doSomething());
        
        InjectBean injectBeanUsingBeanAliases = (InjectBean)factory.getBean("injectBeanUsingBeanAliases");
        System.out.println(injectBeanUsingBeanAliases.getDependency().doSomething());

        System.out.println("********************************");
        injectBean.print();
	}

}
