package paket.Interfaces;

interface BaseInterface{
    void live();
}


interface A extends BaseInterface {
    void live();
}

interface B extends BaseInterface {
    void live();
}

interface AB extends A,B {
    void live();
}

public class DiamondProblem implements AB {
public void live(){

};
    public void ab(AB a){
        a.live();
    }

    public void a(A a){
        a.live();
    }

    public static void main (String[] args){
    DiamondProblem a = new DiamondProblem();
    a.live();
    }

}
