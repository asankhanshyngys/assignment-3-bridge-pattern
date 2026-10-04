package bridge;

import bridge.renderer.RasterRenderer;
import bridge.renderer.Renderer;
import bridge.renderer.VectorRenderer;
import bridge.shape.Circle;
import bridge.shape.Shape;
import bridge.shape.Square;

public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();
        Shape circle = new Circle(5.0, vector);
        Shape square = new Square(4.0, vector);

        System.out.println("1. Draw both shapes with the vector renderer");
        circle.draw();
        square.draw();

        System.out.println("\n2. Switch the SAME circle to the raster renderer");
        circle.setRenderer(raster);
        circle.draw();

        System.out.println("\n3. Switch the SAME square to the raster renderer");
        square.setRenderer(raster);
        square.draw();

        System.out.println("\n4. Switch the SAME circle back to the vector renderer");
        circle.setRenderer(vector);
        circle.draw();
    }
}
