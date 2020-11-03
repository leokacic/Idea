package ankara;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAReflectionWay {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class classDefinition = Class.forName(A.class.getName());
		Object obj =  classDefinition.newInstance();
		System.out.println((A)obj);
		
		Method [] methods = classDefinition.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
//			System.out.println("ispisi ime metode: " + method.getName() );
			if(method.getName().equals("setaString")){
				method.invoke(obj, "aaString");			
			}					
		}		

	
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			
			if(method.getName().equals("print")){
				method.invoke(obj, null);			
			}
			
		}		
		

	}

}
