package Generics;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StoryCharGenerator implements Generator<StoryCharGenerator>, Iterable<StoryCharGenerator>{
    @Override
    public StoryCharGenerator next() {
        return null;
    }

    @Override
    public Iterator<StoryCharGenerator> iterator() {
        return null;
    }

    public static void main(String[] args) {
        Random rand = new Random(47);

    }

}
