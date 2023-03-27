public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double n){
        radius = n;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String n){
        color = n;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    @Override
    public String toString(){
        return "radius = " + radius + ", color = " + color + ", Area = " + getArea();
    }
}
