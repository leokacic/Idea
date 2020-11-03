package paket.InnerClasses;

public class NestedClass {
    static String  name = "Leo";
    private static class NestedClass2 {
        String nestedName = "nested";
        NestedClass2(){
            name="Nested";
        }
    }
    public static void main(String[] args){
        NestedClass2 nested = new NestedClass2();
        nested.nestedName= "leo";
    }
}
