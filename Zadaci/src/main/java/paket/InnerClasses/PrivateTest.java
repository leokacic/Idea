package paket.InnerClasses;

public class PrivateTest {
    private String name = "Leo";
    private void privateMethod(){
        System.out.println(name);
        System.out.println("Privatna metoda");
    }

    class InnerPrivateTest{
        private String name = "Ana";
        public void modify(){
            System.out.println(name);
            privateMethod();
        }
    }

    void createObject(){
        InnerPrivateTest ex = new InnerPrivateTest();
        ex.modify();
        ex.name= "leo";
    }

    public static void main (String[] args){
        PrivateTest ex = new PrivateTest();
        ex.privateMethod();
        ex.createObject();
        PrivateTest.InnerPrivateTest ex2 = new PrivateTest().new InnerPrivateTest();
        ex2.name = "leo";
    }
}
