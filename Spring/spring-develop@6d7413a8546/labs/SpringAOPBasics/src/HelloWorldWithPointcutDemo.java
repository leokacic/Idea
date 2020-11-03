

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;


public class HelloWorldWithPointcutDemo {

    public static void main(String[] args) {

        // get proxy
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvisor(new DefaultPointcutAdvisor(new SimpleBeforeAdviceDemo()));
        
        pf.setTarget(new MessageWriter());
        MessageWriter proxy1 = (MessageWriter)pf.getProxy();
        proxy1.writeMessage();
        
        pf.setTarget(new MessageWriter());
        MessageWriter proxy2 = (MessageWriter)pf.getProxy();
        proxy2.writeMessage();
        
        pf.setTarget(new ErrorBean());
        ErrorBean proxy3 = (ErrorBean)pf.getProxy();
        proxy3.hashCode();
        
    }
}
