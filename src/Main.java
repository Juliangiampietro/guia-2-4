public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0, "blue");
        System.out.println(c1.showCircle());

        Cylinder cy1 = new Cylinder(4.4,"red",2.2);
        System.out.println(cy1.showCylinder());
    }
}