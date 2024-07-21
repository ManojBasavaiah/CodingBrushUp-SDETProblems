package OOPs.Polymorphism.ContructorOverloading;

public class Box {
    double width, height, depth;

    Box() {
        width = height = depth = 0;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
