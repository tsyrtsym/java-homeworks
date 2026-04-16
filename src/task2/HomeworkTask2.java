package task2;

public class HomeworkTask2 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5.0, "Красный", "Черный"),
            new Rectangle(4.0, 6.0, "Синий", "Желтый"),
            new Triangle(3.0, 4.0, 5.0, "Зеленый", "Белый")
        };
        
        System.out.println("=== Характеристики фигур ===\n");
        
        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}