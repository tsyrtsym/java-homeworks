public class HomeworkTask1 {
    public static void main(String[] args) {
        // Часть 1: демонстрация бега и плавания
        System.out.println("=== Часть 1: Животные ===\n");
        
        Dog bobik = new Dog("Бобик");
        Dog rex = new Dog("Рекс");
        Cat murka = new Cat("Мурка");
        Cat barsik = new Cat("Барсик");
        
        bobik.run(300);
        bobik.run(600);  // слишком далеко
        bobik.swim(5);
        bobik.swim(15);  // слишком далеко
        
        murka.run(150);
        murka.run(250);  // слишком далеко
        murka.swim(5);   // кот не умеет плавать
        
        // Статистика
        System.out.println("\n=== Статистика ===");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
        
        // Часть 2: коты и миска
        System.out.println("\n=== Часть 2: Коты и миска ===\n");
        
        // Массив котов
        Cat[] cats = {
            new Cat("Вася"),
            new Cat("Пушок"),
            new Cat("Мурзик"),
            new Cat("Снежок")
        };
        
        // Миска с 20 едой
        Bowl bowl = new Bowl(20);
        bowl.info();
        
        // Кормим котов (каждый хочет 10)
        System.out.println("\n--- Кормление ---");
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }
        
        // Выводим сытость
        System.out.println("\n--- Сытость котов ---");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isFull() ? "сыт" : "голоден"));
        }
        
        // Добавляем еду
        System.out.println("\n--- Добавляем еду ---");
        bowl.addFood(15);
        bowl.info();
        
        // Докармливаем голодных
        System.out.println("\n--- Докармливаем голодных ---");
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }
        
        // Итог
        System.out.println("\n--- Итоговая сытость ---");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isFull() ? "сыт" : "голоден"));
        }
        bowl.info();
    }
}