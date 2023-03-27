public class soal3 {
    public static void main(String[] args) {
        Shape bentuk1 = new Shape("Red", true);
        bentuk1.setColor("Yellow");
        System.out.println(bentuk1.getColor());
        bentuk1.setFilled(false);
        System.out.println(bentuk1.isFilled());
        System.out.println(bentuk1);
    }
}
