public abstract class Shape {
    private Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    protected Renderer getRenderer() {
        return renderer;
    }

    public abstract void draw();
}
