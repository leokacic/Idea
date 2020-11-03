package injectsimplevalues;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InjectSimpleValuesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(
        						new ClassPathResource("/META-INF/spring/injectsimplevalues-context.xml"));

        InjectSimpleValues simpleValues = (InjectSimpleValues)factory.getBean("injectSimpleValues");
		
        System.out.println(simpleValues.getName());
        System.out.println(simpleValues.getAge());
        System.out.println(simpleValues.getHeight());
        System.out.println(simpleValues.isSpringFun());
        System.out.println(simpleValues.getAgeInSeconds());
        System.out.println(simpleValues.getDate());
        

//        InjectSimpleValues simpleValuesPNamespace = (InjectSimpleValues)factory.getBean("injectSimpleValuesPNamespace");
//		
//        System.out.println(simpleValuesPNamespace.getName());
//        System.out.println(simpleValuesPNamespace.getAge());
//        System.out.println(simpleValuesPNamespace.getHeight());
//        System.out.println(simpleValuesPNamespace.isSpringFun());
//        System.out.println(simpleValuesPNamespace.getAgeInSeconds());

	}
}
