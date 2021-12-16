package pr3;

public class Main {
    public static void main(String[] args) {
        Circle krug1 = new Circle(10, "Yellow", 1);
        System.out.println(krug1);
        krug1.setRadius(5);
        krug1.setColor("Green");
        krug1.setS(78.5);
        System.out.println(krug1);
        System.out.println("Новая площадь = " + krug1.getS());
    }
}
