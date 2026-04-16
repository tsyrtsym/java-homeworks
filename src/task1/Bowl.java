public class Bowl {
    private int foodAmount;  // количество еды в миске
    
    public Bowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0);  // не может быть отрицательной
    }
    
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды. Теперь в миске " + foodAmount);
        }
    }
    
    public void takeFood(int amount) {
        if (amount > 0 && amount <= foodAmount) {
            foodAmount -= amount;  // только если хватает!
        }
    }
    
    public int getFood() {
        return foodAmount;
    }
    
    public void info() {
        System.out.println("В миске " + foodAmount + " еды");
    }
}