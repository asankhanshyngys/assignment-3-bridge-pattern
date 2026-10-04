package bridge.shape;

import bridge.renderer.Renderer;

public class Square extends Shape {
    private final double side;

    public Square(double side, Renderer renderer) {
        super(renderer);
        this.side = positiveDimension(side);
    }

    @Override
    public void draw() {
        renderer().renderSquare(side);
    }
}
