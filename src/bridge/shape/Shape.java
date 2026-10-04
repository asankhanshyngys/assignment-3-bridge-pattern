package bridge.shape;

import bridge.renderer.Renderer;
import java.util.Objects;

public abstract class Shape {
    private Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer, "Renderer must not be null");
    }

    public final void setRenderer(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer, "Renderer must not be null");
    }

    protected final Renderer renderer() {
        return renderer;
    }

    protected static double positiveDimension(double value) {
        if (!Double.isFinite(value) || value <= 0) {
            throw new IllegalArgumentException("Dimension must be finite and greater than zero");
        }
        return value;
    }

    public abstract void draw();
}
