public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, new VectorRenderer());
        Shape square = new Square(4, new VectorRenderer());

        System.out.println("Before switching:");
        circle.draw();
        square.draw();

        circle.setRenderer(new RasterRenderer());
        square.setRenderer(new RasterRenderer());

        System.out.println("After switching the same shapes:");
        circle.draw();
        square.draw();
    }
}
