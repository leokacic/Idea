

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class YetAnotherMessageDecorator implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
    	//what time is it
    	//invoke
    	//end time - start time
    	
    	System.out.print("Yet ");
    	
    	invocation.proceed();
    	System.out.print(" another");
    	
    	return null;
    	/*
    	if(!invocation.getMethod().getName().equals("nista")){
	        System.out.print("Hello ");
	        Object retVal = invocation.proceed();
	        System.out.println("!");
	        return retVal;

    	}*/
        //return null;
    }

}