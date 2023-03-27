public class Cylinder extends Circle {
    private double height = 1;
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double n){
        this.height = n;
    }
    public double hitungVolume() {
        return (getArea()*height);
    }
    @Override
    public String toString(){
        return "radius = " + getRadius() + ", color = " + getColor() + ", Circle Area = " + getArea() + " Volume = " + hitungVolume();
    }
}


