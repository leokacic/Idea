package TypeInformation;

import java.util.Arrays;
import java.util.List;

abstract class Shape {

    void draw() { System.out.println(this + ".draw()"); }

    public void highlight(){
        flag = true;
    }
    public void highlightOff(){
        flag = false;
    }

    void rotate(){ System.out.println(this + ".rotate"); }

    abstract public String toString();
    boolean flag = false;
}



class Circle extends Shape {
    public String toString() {
       if(flag){
           return "Highlighted Circle";
       } else {
         return "UnHighlighted Circle";
       }
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) throws InstantiationException {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList){
            shape.draw();
            shape.rotate();
            shape.highlight();
            shape.draw();
            shape.rotate();
        }

        Shape romb = new Rhomboid();

    /*  if(romb instanceof Circle ){
            Circle downcastedCircle = (Circle) romb;
        } else{
            throw new InstantiationException();
        }*/

        Rhomboid downcastedRomb = (Rhomboid) romb;

    }
}