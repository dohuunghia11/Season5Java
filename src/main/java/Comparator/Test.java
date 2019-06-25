package Comparator;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes =  new Shape[4];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        shapes[2] = new Square();
        shapes[3] = new Circle(3.6);
        for (Shape shape : shapes ) {
            if(shape instanceof Square){
                Colorable colorable = (Square) shape;
                colorable.howToColor();
            }
        }
    }
}
