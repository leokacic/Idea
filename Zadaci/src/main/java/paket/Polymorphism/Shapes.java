package paket.Polymorphism;

class Cube extends Shape{

}

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static  void main(String[] args){
        Cube c = new Cube();

        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        c.print();;
            for(Shape shp:s) {
                shp.draw();
                shp.print();
            }
    }
}
