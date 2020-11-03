package beanlifecycle;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyBeanFactoryPostProcessorDemo {

	public static void main(String[] args) {
		
		ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(
							new ClassPathResource("/META-INF/spring/beanlifecycle-context.xml"));
		
		BeanFactoryPostProcessor bfpp = (BeanFactoryPostProcessor) beanFactory.getBean("bfpp");
		bfpp.postProcessBeanFactory(beanFactory);
		
		SimpleBean simpleBean = (SimpleBean) beanFactory.getBean("simpleBeanForMyBeanFactoryPostProcessor");
		System.out.println(simpleBean);
	}
}
