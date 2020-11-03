import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello World My Bean Factory demo.
 *
 * Class and method info are put into property file.
 */

public class HelloWorldFactoryDemo {

    public static void main(String[] args) throws Exception {

        // application context for annotations (java style config)
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyConfig.class);

		// property configuration
        PropertyConfig config = applicationContext.getBean(PropertyConfig.class);

        // display properties
        System.out.println("Properties from application.property file: \n" + config.toString());

		// create bean factory
		MyBeanFactory factory = new MyBeanFactory();

		// check is singleton
		boolean isSingleton = checkIsSingletonBeanType(config.getBeanType());
        System.out.println((isSingleton) ? "It's Singleton bean" : "It's Prototype bean");

        /**
         * instantiate object
         */
		IHelloWorld helloObj = (IHelloWorld)factory.getBean(config.getClassName(), isSingleton);

        // display object reference
        System.out.println("\nObject reference = " + helloObj.toString());

		// construct method name
		String methodName = "set" + config.getFieldName().substring(0,1).toUpperCase() + config.getFieldName().substring(1, config.getFieldName().length());
        //System.out.println("Method name = " + methodName);

		// invoke (execute) the class method
        factory.invokeMethod(config.getClassName(), helloObj, methodName, config.getFieldValue());

        // sayHello
        helloObj.sayHello();


        /**
         * create another object
         */
        IHelloWorld helloObj2 = (IHelloWorld)factory.getBean(config.getClassName(), isSingleton);

        // display object reference
        System.out.println("\nObject reference = " + helloObj2.toString());

        if (helloObj == helloObj2) System.out.println("It's singleton object, the reference: " + helloObj.toString() + " is the same!");

        // construct method name
        String methodName2 = "set" + config.getFieldName().substring(0,1).toUpperCase() + config.getFieldName().substring(1, config.getFieldName().length());

        // invoke (execute) the class method
        factory.invokeMethod(config.getClassName(), helloObj2, methodName2, config.getFieldValue());

        // sayHello
        helloObj2.sayHello();

	}

    /**
     * @param beanType
     * @return true when Singleton, false when Prorotype or beanType info is missing or wrong
     */
    private static boolean checkIsSingletonBeanType(String beanType) {
        if (beanType == null || beanType.isEmpty()) {
            return true;  // singleton is default value!
        }else if (beanType.toLowerCase().equals("prototype")) {
            return false;
        }else {
            return true;  // singleton is default value
        }
    }

}
