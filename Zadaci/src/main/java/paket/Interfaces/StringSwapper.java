package paket.Interfaces;

public class StringSwapper implements Processor{
    StringSwapper(){
        String s = "geeksforgeeks";

        //System.out.println(SwapString(s, 6, s.length() - 2));
    }

    @Override
    public Object process(Object input) {
        String str = (String)input;
        int i,j;
        i=0;
        j=6;
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        System.out.println(ch);
        return ch;
    }

    @Override
    public String name() {
        return null;
    }


    public static void main(String[] args){
        String s = "geeksforgeeks";
        Apply.process(new StringSwapper(),s);
/*        System.out.println(SwapString(s, 6, s.length() - 2));
        System.out.println(SwapString(s, 0, s.length() - 1));

        System.out.println(s);*/
    }
}


