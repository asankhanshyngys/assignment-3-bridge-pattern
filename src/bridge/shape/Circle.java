package bridge.shape;

import bridge.renderer.Renderer;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius, Renderer renderer) {
        super(renderer);
        this.radius = positiveDimension(radius);
    }

    @Override
    public void draw() {
        renderer().renderCircle(radius);
    }
}
