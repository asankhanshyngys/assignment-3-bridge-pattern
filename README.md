# Assignment 3 Bridge Pattern

Java 17 console example. Circle and Square delegate drawing to a Renderer. Main shares vector and raster renderers, switches the same shapes at runtime, and switches the circle back to vector rendering. Output describes the drawing operations; no graphics library is needed.

## Run

```sh
javac --release 17 -d out -sourcepath src src/bridge/Main.java
java -cp out bridge.Main
```

## Structure

- `src/bridge/Main.java`: runtime demonstration.
- `src/bridge/shape/`: Shape, Circle, and Square.
- `src/bridge/renderer/`: Renderer, VectorRenderer, and RasterRenderer.
- `Report.pdf`: explanation, UML, five Clean Code principles with excerpts, conclusion, and repository link.
