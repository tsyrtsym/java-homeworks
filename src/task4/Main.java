package task4;

public class Main {
    
    public static void demonstrateArrayIndexOutOfBounds() {
        System.out.println("\n=== ArrayIndexOutOfBoundsException ===\n");
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e);
            System.out.println("Нельзя обращаться к индексу 5, длина массива 3");
        }
    }
    
    public static void main(String[] args) {
        // Правильный массив
        String[][] correct = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        
        try {
            int sum = ArraySumCalculator.sumArray(correct);
            System.out.println("Сумма правильного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Массив с неправильными данными
        String[][] wrongData = {
            {"1", "2", "3", "4"},
            {"5", "шесть", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        
        try {
            ArraySumCalculator.sumArray(wrongData);
        } catch (MyArrayDataException e) {
            System.out.println("\nОшибка данных: " + e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        
        demonstrateArrayIndexOutOfBounds();
    }
}
