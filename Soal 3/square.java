public class Square extends Rectangle{
    public Square() {
        super("red", true, 1.0, 1.0);
      }
    
      public Square(double side) {
        super("red", true, side, side);
      }

    public Square(String color, boolean filled, double width, double lenght) {
        super(color, filled, width, lenght);
    }
    public void setWidth(double width) {
        super.width = width;
    }
    public void setLenght(double lenght) {
        super.lenght = lenght;
    }

    // menurut saya getArea() dan getPerimeter() tidak usah di override, karena kita tetap bisa menggunakan method tersebut
    // untuk mencari luas dan keliling dari persegi. jika semisal class yang di gunakan bukan persegi, tetapi segitiga, maka 
    // kita harus mengoverride ke 2 method tersebut.

    @Override
    public String toString() {
        return "Square dengan side : " + getWidth() + ", dan luas : " + getArea() + "adalah subclass dari " + super.toString();
    }
}
