package Generics;

public class StoryCharacter {
    private boolean goodGuy = true;

    public boolean isGoodGuy() {
        return goodGuy;
    }

    public void setGoodGuy(boolean goodGuy) {
        this.goodGuy = goodGuy;
    }

    @Override
    public String toString() {
        return "StoryCharacter{" +
                "goodGuy=" + goodGuy +
                '}';
    }
}

class ObiWan extends StoryCharacter{
    @Override
    public void setGoodGuy(boolean goodGuy) {
        goodGuy = true;
    }
}

class Vader extends StoryCharacter{
    @Override
    public void setGoodGuy(boolean goodGuy) {
        goodGuy = false;
    }
}
