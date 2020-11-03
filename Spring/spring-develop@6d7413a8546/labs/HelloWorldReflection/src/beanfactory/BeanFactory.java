package beanfactory;

public interface BeanFactory {
	Object getBean(String className, String methodName, String agrValue) throws Exception;
}
