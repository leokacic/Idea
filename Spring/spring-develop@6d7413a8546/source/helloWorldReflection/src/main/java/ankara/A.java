package ankara;

public class A implements IPrint{
	
	private C c;

	public void setC(C c) {
		this.c = c;
	}

	private String aString;

	public void setaString(String aString) {
		this.aString = aString;
	}

	public void print(){
		System.out.println("aString: " + aString);
	}
}
