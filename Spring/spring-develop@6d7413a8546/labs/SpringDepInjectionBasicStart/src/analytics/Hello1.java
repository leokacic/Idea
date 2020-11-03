package analytics;

public class Hello1 implements IAnalyticsHelloWorld {

	private String message;
	
	private ArabicString arabicString;
	
	
	public void myInit(){
		System.out.println("do some initialization .........");
	}
	
	public void myDestroy(){
		System.out.println("do some destroy .........");
	}
	
	@Override
	public void sayHello() {
		if(false){
			System.out.println(message);
		}else{
			System.out.println(arabicString.getArabicMessage());			
		}
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setArabicString(ArabicString arabicString) {
		this.arabicString = arabicString;
	}



	
}
