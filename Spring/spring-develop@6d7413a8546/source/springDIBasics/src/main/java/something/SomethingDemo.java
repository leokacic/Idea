package something;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SomethingDemo {

	public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/spring/something-context.xml"));

        ISomething something = (ISomething)factory.getBean("something");
        
        something.doSomething();
        
        System.out.println("***********************");
        
        try {
            // Creates an object of type Class which contains the information of 
            // the class String
            Class cl1 = Class.forName("something.SetterInjection");
            
            Object si = cl1.newInstance();
            
            Method mtd[] = cl1.getMethods();
            
            System.out.println(((SetterInjection)si).getDependency());
         
            for (int i = 0; i < mtd.length; i++) {
//        	  System.out.println(mtd[i].getName());
        	  if(mtd[i].getName().equals("setDependency")){
//        		  System.out.println("postoji metoda setDependency");
        		  mtd[i].invoke(si, new Dependency());
        	  }
          }

            System.out.println(((SetterInjection)si).getDependency());
        	
        	
        	
        	
        	
          
        	
        	
        	
        	
        	
        	
        	
        	
        	
//        	
//            Class cl = Class.forName("java.lang.String");
//
//            String str = (String)cl.newInstance();
//            
//            // getDeclaredFields() returns all the constructors of the class.
//            Constructor cnst[] = cl.getConstructors();
//
//            // getFields() returns all the declared fields of the class.
//            java.lang.reflect.Field fld[] = cl.getDeclaredFields();
//
//            // getMethods() returns all the declared methods of the class.
//            Method mtd[] = cl.getMethods();
//            
//            System.out.println("Name of the Constructors of the String class");
//
//            for (int i = 0; i < cnst.length; i++) {
//              System.out.println(cnst[i].getName());
//            }
//
//            System.out.println("Name of the Declared fields");
//
//            for (int i = 0; i < fld.length; i++) {
//              System.out.println(fld[i].getName());
//            }
//
//            System.out.println("Name of the Methods");
//
//            for (int i = 0; i < mtd.length; i++) {
//              System.out.println(mtd[i].getName());
//            }

          } catch (Exception e) {
            e.printStackTrace();
          }
	}

}
