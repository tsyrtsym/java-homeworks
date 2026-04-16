package task2;

public interface Shape extends Colorable {
    double getPerimeter();
    double getArea();
    
    default void printInfo() {
        System.out.println("=== " + getClass().getSimpleName() + " ===");
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println();
    }
}