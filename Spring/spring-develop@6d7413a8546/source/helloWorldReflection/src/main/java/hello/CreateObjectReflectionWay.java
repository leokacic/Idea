package hello;

import java.lang.reflect.Method;

import beanfactory.BeanFactory;
import beanfactory.CommandLineBeanFactory;

public class CreateObjectReflectionWay {

	public static void main(String[] args) throws Exception {

		if(args.length<1){
			System.out.println("nema argumenata");
			System.exit(0);
		}else {
			System.out.println("1 param classname = " + args[0]);
			System.out.println("2 param methodname = " + args[1]);
			System.out.println("3 param arg value = " + args[2]);
		}

		BeanFactory factory = new CommandLineBeanFactory();

		// String className, String methodName, String agrValue
		IHelloWorld hello = (IHelloWorld)factory.getBean(args[0], args[1], args[2]);
		hello.sayHello();

//		IHelloWorld hello1 = (IHelloWorld)factory.getBean(args[0]);
//		hello1.sayHello();

	}

}
