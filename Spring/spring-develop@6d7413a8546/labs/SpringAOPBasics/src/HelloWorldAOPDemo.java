

import org.springframework.aop.framework.ProxyFactory;


public class HelloWorldAOPDemo {

    public static void main(String[] args) {
    	// this object can be created by beanFactory as well
        IMessageWriter target = new MessageWriter();
        
        // create the proxy
        ProxyFactory pf = new ProxyFactory();

        pf.addAdvice(new YetAnotherMessageDecorator());
        pf.addAdvice(new MessageDecorator());
        
        pf.setTarget(target);


        IMessageWriter proxy = (IMessageWriter) pf.getProxy();
        
        // write the messages
        target.writeMessage();
        System.out.println();
        
        System.out.println("****************");
        proxy.writeMessage();
        //proxy.nothing();
    
        //proxy.nista();
    }
}