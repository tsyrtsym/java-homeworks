public class Dog extends Animal {
    private static int dogCount = 0;  // счётчик собак
    
    public Dog(String name) {
        super(name, 500, 10);  // вызываем конструктор Animal с лимитами
        dogCount++;
    }
    
    public static int getDogCount() {
        return dogCount;
    }
}