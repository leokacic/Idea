package ankara;

import beanfactory.BeanFactory;
import beanfactory.CommandLineBeanFactory;

public class TestBeanFactoryWay {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		BeanFactory factory = new CommandLineBeanFactory();
		IPrint print = (IPrint)factory.getBean(args[0], args[1], args[2]);
		
		print.print();
	}

}
