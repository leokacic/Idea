package paket.Polymorphism;

public class Starship {
    void state(){}
}

class AlertedStarship extends Starship{
    void state(){
        System.out.println("Alerted state");
    }
}

class PreparedStarship extends Starship{
    void state(){
        System.out.println("Prepared state");
    }
}

class BattleStarship extends Starship{
    void state(){
        System.out.println("Battle state");
    }
}
class State {
    private Starship starship = new PreparedStarship();
    public void prepareForBattle(){
        starship = new BattleStarship();
    }
    public void prepareForAlert(){
        starship = new AlertedStarship();
    }
    public void fly(){
        starship.state();

    }
}

class Transmogrify {
    public static void main(String[] args){
        State state = new State();
        state.fly();
        state.prepareForAlert();
        state.fly();
        state.prepareForBattle();
    }
}