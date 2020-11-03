package applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextAwareDemo implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
       this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "/META-INF/spring/contextawaredemo-context.xml");

        ContextAwareDemo demo = (ContextAwareDemo) ctx.getBean("contextAware");
        demo.displayAppContext();
    }

    public void displayAppContext() {
        System.out.println(applicationContext);
    }

}