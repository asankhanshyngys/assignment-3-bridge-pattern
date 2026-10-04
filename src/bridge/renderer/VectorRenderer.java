package bridge.renderer;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Vector renderer: circle with radius " + radius
                + " using a mathematical curve.");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Vector renderer: square with side " + side
                + " using line segments.");
    }
}
