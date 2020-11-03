import java.util.*;

    public class nameGenerator {
    public static void generate(List<String> lista){


        lista.add(0, "Obi wan never told you what happened to your father");
        lista.add(1, "He told me enough");
        lista.add(2, "He told me you killed him");
        lista.add(3, "No, I am your father!");
        System.out.println(lista);

    }
    public static void generateHash(HashSet<String> lista){


        lista.add( "Obi wan never told you what happened to your father");
        lista.add("He told me enough");
        lista.add( "He told me you killed him");
        lista.add( "No, I am your father!");
        System.out.println(lista);

    }
    public static void generateTree(TreeSet<String> lista){


        lista.add( "Obi wan never told you what happened to your father");
        lista.add("He told me enough");
        lista.add( "He told me you killed him");
        lista.add( "No, I am your father!");
        System.out.println(lista);

    }
    public void next()
    {

    }
    public static void main(String[] args){
        LinkedList<String> listaLinkedList= new LinkedList<String>();
        ArrayList<String> listaArrayList= new ArrayList<String>();
        HashSet<String> listaHashSet= new HashSet<String>();
        LinkedHashSet<String> listaLinkedHashSet= new LinkedHashSet<String>();
        TreeSet<String> listaTreeSet= new TreeSet<String>();

        generate(listaLinkedList);
        generate(listaArrayList);
        generateHash(listaHashSet);
        generateHash( listaLinkedHashSet);
        generateTree(listaTreeSet);

    }
}
