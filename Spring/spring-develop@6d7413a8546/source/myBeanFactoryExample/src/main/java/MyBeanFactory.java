import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * My Bean Factory implementation
 */
public class MyBeanFactory {

    /** a singleton objects collection for different classes */
    private HashMap<String, IHelloWorld> beansMap = new HashMap<>();

    /**
     * Constructor
     */
    public MyBeanFactory() {
    }

    /**
     * Return object of specified class
     *
     * @param className - a class name with package name
     * @param  isSingleton - true when singleton, false when prototype
     * @return object
     * @throws Exception
     */
    public Object getBean(String className, boolean isSingleton) throws Exception {

        if (isSingleton && beansMap.containsKey(className)) {
            // get singleton bean from map
            return beansMap.get(className);

        } else {
            Class classDefinition = null;

            try {
                classDefinition = Class.forName(className);
            }catch (ClassNotFoundException ex) {
                System.out.println("Sorry, CANNOT find a class with name " + className + " in the project. Exiting!");
                throw new Exception(ex);
            }

            // create singleton object
            Object myBean = classDefinition.newInstance();

            // if singleton add it into map (we don't track created prototypes)
            if (isSingleton) beansMap.put(className, (IHelloWorld) myBean);

            return myBean;
        }
    }

    /**
     * Invoke method on provided object.
     *
     * @param className
     * @param obj
     * @param methodName
     * @param methodArgmValue
     * @throws Exception
     */
    public void invokeMethod(String className, Object obj, String methodName, String methodArgmValue) throws Exception {

        Class classDefinition;

        try {
            classDefinition = Class.forName(className);
        } catch (ClassNotFoundException ex) {
            System.out.println("Sorry, CANNOT find a class with name " + className + " in the project. Exiting!");
            throw new Exception(ex);
        }

        // find array of class methods
        Method[] methods = classDefinition.getMethods();

        boolean methodFound = false;

        // find method methodName
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            if (method.getName().equals(methodName)) {
                // method found
                methodFound = true;
                // invoke method
                method.invoke(obj, methodArgmValue);
            }
        }

        if (!methodFound) System.out.println("Sorry, method " + methodName + " is NOT found in a class " + className);
    }

}
