package beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializingBeanDemo  {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "/META-INF/spring/beanlifecycle-context.xml");

        System.out.println("****************");
        SimpleBeanIB simple1 = (SimpleBeanIB) ctx.getBean("simpleIB1");
        System.out.println(simple1.toString());
        
        SimpleBeanIB simple2 = (SimpleBeanIB) ctx.getBean("simpleIB2");
        System.out.println(simple2.toString());

    }


}