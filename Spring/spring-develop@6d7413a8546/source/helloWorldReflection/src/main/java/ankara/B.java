package ankara;

public class B implements IPrint{

	private String aString;

	public void setaString(String aString) {
		this.aString = aString;
	}
	
	public void print(){
		System.out.println("this is second impl of the IPrint" + aString);
	}
}
