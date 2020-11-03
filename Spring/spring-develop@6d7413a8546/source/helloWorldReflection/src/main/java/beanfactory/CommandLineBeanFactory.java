package beanfactory;

import hello.IHelloWorld;

import java.io.File;
import java.lang.reflect.Method;


public class CommandLineBeanFactory implements BeanFactory{

//	private File file;
//	
//	public CommandLineBeanFactory(File file){
//		this.file = file;
//		// ako pretpostavime da file ima informacije kako napraviti beanove onda 
//	}
	
	public CommandLineBeanFactory(){};
	
	public Object getBean(String className, String methodName, String agrValue) throws Exception {

//		IHelloWorld hello = (IHelloWorld)factory.getBean(args[0], args[1], args[2]);
//		hello.sayHello();

		Class classDefinition = Class.forName(className);
		Object obj =  classDefinition.newInstance();
		
		// invoke method
		Method [] methods = classDefinition.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			if(method.getName().equals(methodName)){
				method.invoke(obj, agrValue);
				
			}
		}
		return obj;
	}

}
