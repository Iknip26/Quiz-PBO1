public class Circle2 extends Shape{
    double radius;

    public Circle2(){

    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * 3.14;
    }
    public double getPerimeter(){
        return 2* this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle3{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}