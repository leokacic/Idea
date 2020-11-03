import javax.print.attribute.standard.MediaSize;

public class nonDefault {

    public static class InnerClass {
        InnerClass() {
            nonDefault a = new nonDefault();
            String str = "String";
        }
    }
}

class other{
    other outer = new other();

    public class InnerNonDefault extends nonDefault.InnerClass{

    }
}