import java.util.ArrayList;
import java.util.List;

interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Desenare Dreptunghi");
    }

    @Override
    public void resize() {
        System.out.println("Redimensionare dreptunghi");
    }

    @Override
    public String description() {
        return "Obiect dreptunghiular";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Desenare Cerc");
    }

    @Override
    public void resize() {
        System.out.println("Redimensionare cerc");
    }

    @Override
    public String description() {
        return "Obiect cerc";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}

class Drawing {

    List<Shape> shapes = new ArrayList<Shape>();

    public Drawing() {
        super();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return new ArrayList<Shape>(shapes);
    }

    public void draw() {
        if (shapes.isEmpty()) {
            System.out.println("Nimic de desenat!");
        } else {
            shapes.stream().forEach(shape -> shape.draw());
        }
    }

    public void resize() {
        if (shapes.isEmpty()) {
            System.out.println("Nimic de redimensionat!");
        } else {
            shapes.stream().forEach(shape -> shape.resize());
        }
    }
}

public class Adapter {

    public static void main(String[] args) {

        System.out.println("Crearea desenului de forme ... ");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        System.out.println("Desenare...");
        drawing.draw();
        System.out.println("Redimensionare...");
        drawing.resize();
    }
}
