package injectbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InjectBeanFromExternalFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        BeanFactory parent = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/injectbeanfromsamefactory-context.xml"));

        BeanFactory child = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/injectbeanfromexternalfactory-context.xml"), parent);

        InjectBean injectBean = (InjectBean)child.getBean("injectExternalBean");
        System.out.println(injectBean.getDependency().doSomething());
	}

}
