package hello;

import java.lang.reflect.Method;

import beanfactory.BeanFactory;
import beanfactory.CommandLineBeanFactory;

public class CreateObjectReflectionWay {

	public static void main(String[] args) throws Exception {

		if(args.length<1){
			System.out.println("nema argumenata");
			System.exit(0);
		}

		BeanFactory factory = new CommandLineBeanFactory();
		
		IHelloWorld hello = (IHelloWorld)factory.getBean(args[0], args[1], args[2]);
		hello.sayHello();

//		IHelloWorld hello1 = (IHelloWorld)factory.getBean(args[0]);
//		hello1.sayHello();

	}

}
