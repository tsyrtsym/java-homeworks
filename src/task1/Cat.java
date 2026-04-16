public class Cat extends Animal {
    private static int catCount = 0;   // счётчик котов
    private boolean isFull;            // сытость (голоден по умолчанию)
    
    public Cat(String name) {
        super(name, 200, 0);  // 0 = не умеет плавать
        this.isFull = false;   // коты создаются голодными
        catCount++;
    }
    
    public void eat(Bowl bowl, int amount) {
        if (bowl.getFood() >= amount && amount > 0) {
            bowl.takeFood(amount);      // убираем еду из миски
            isFull = true;               // кот стал сытым
            System.out.println(name + " поел(а) " + amount + " еды. Теперь сыт(а)!");
        } else {
            System.out.println(name + " не хватило еды. Остался(ась) голодным(ой)");
        }
    }
    
    public boolean isFull() {
        return isFull;
    }
    
    public static int getCatCount() {
        return catCount;
    }
}