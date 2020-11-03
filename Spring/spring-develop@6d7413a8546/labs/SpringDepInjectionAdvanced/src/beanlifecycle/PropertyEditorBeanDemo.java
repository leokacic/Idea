package beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyEditorBeanDemo  {

    public static void main(String[] args) {
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext(
    	 									"/META-INF/spring/propertyEditor-context.xml");

        PropertyEditorBean bean = (PropertyEditorBean) factory.getBean("propertyEditorBean");
        
        System.out.println(bean.getDate());
        
        // or
        /*
        ConfigurableListableBeanFactory factory = new XmlBeanFactory(
                new FileSystemResource("build/custom.xml"));

        CustomEditorConfigurer config = (CustomEditorConfigurer) factory
                .getBean("customEditorConfigurer");

        config.postProcessBeanFactory(factory);

        CustomEditorExample bean = (CustomEditorExample) factory
                .getBean("exampleBean");         */
    }


}