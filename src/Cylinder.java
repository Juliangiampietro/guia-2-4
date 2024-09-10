public class Cylinder extends Circle {

    private Double Height = 1.0;


    @Override
    public Double calculateArea (){
        return  2 * Math.PI * super.getRatio() * Height + 2 * Math.PI * super.getRatio() * super.getRatio();

    }

    public String showCylinder(){
        return "El radio es: " +super.getRatio()+" El color es: "+ super.getColor() + " El area es: " + calculateArea() + " La altura es: " +Height;

    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(Double height) {
        Height = height;
    }

    public Cylinder(Double ratio, String color, Double height) {
        super(ratio, color);
        Height = height;
    }

    public Cylinder(Double height) {
        Height = height;
    }
}
