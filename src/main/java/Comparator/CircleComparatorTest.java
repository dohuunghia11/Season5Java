package Comparator;


public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        for(int i = 0; i < circles.length - 1; i++){
            if(circleComparator.compare(circles[i], circles[i + 1]) == 1){
                Circle circle = new Circle();
                circle = circles[i];
                circles[i] = circles[i + 1];
                circles[i + 1] = circle;
            }

        }

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        System.out.println("Area Pre-resized : " + circles[1].getArea());
        long percent = Math.round(Math.random() * 100);
        circles[1].resize(percent);
        System.out.println("Area After-resized : " + circles[1].getArea());
    }
}