public class HelloWorld {
    public static void main(String args[]){
        System.out.print("Hello");

        String p = null;
        try{
            if(p.equals("aaa"))
            {
                System.out.print("It is the same");
            }
            else {
                System.out.print("It is not the same");
            }
        }catch(NullPointerException e){
            System.out.print("Null pointer exception");

        }
    }
}
