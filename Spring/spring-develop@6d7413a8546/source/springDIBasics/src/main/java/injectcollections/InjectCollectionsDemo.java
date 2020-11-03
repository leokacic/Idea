package injectcollections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InjectCollectionsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

        BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/injectcollections-context.xml"));

        InjectCollections injectCollections = (InjectCollections)factory.getBean("injectCollections");
			
        System.out.println(injectCollections.getMap().get("someValue"));
        System.out.println(((Dependency)injectCollections.getMap().get("someBean")).doSomething());
        
        System.out.println(injectCollections.getProps().get("firstName"));
        System.out.println(injectCollections.getProps().get("secondName"));
        
        Object arraySet[] =  injectCollections.getSet().toArray();
        for (int i = 0; i < arraySet.length; i++) {
			Object o = arraySet[i];
			if(i == 0){
				System.out.println( o);
			}else if(i == 1){
				System.out.println( ((Dependency)o).doSomething());
			}
		}
        
        System.out.println(injectCollections.getList().size());
        System.out.println( injectCollections.getList().get(0));
        System.out.println( ((Dependency)injectCollections.getList().get(1)).doSomething());
	}

	

}
