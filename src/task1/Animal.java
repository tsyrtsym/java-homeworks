public abstract class Animal {
    protected String name;      // имя животного
    protected int runLimit;     // максимальная дистанция бега
    protected int swimLimit;    // максимальная дистанция плавания
    protected static int animalCount = 0;  // счётчик всех животных
    
    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;  // при создании животного увеличиваем счётчик
    }
    
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }
    
    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
    
    public static int getAnimalCount() {
        return animalCount;
    }
}