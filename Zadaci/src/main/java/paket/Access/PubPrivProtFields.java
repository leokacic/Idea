package paket.Access;

public class PubPrivProtFields {
    public String publicString;
    private String privateString;
    protected  String protectedString;

    static public String publicMethod(String a){
        System.out.println("Public string: " + a);
        return a;
    }
    static private String privateMethod(String a){
        System.out.println("Private string:  " + a);
        return a;
    }
    static protected String protectedMethod(String a){
        System.out.println("Protected string: " + a);
        return a;
    }

    public static void main(String[] args){
       PubPrivProtFields ex = new PubPrivProtFields();
       ex.privateString = "leo";
       protectedMethod(ex.privateString);
    }
}
