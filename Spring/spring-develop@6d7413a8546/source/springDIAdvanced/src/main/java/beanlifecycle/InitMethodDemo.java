package beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMethodDemo  {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "/META-INF/spring/beanlifecycle-context.xml");

        System.out.println("*************");
        SimpleBean simple1 = (SimpleBean) ctx.getBean("simple1");
        System.out.println(simple1.toString());
        
        SimpleBean simple2 = (SimpleBean) ctx.getBean("simple2");
        System.out.println(simple2.toString());

    }


}