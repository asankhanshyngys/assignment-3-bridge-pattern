package bridge.renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Raster renderer: circle with radius " + radius + " using pixels.");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Raster renderer: square with side " + side + " using pixels.");
    }
}
