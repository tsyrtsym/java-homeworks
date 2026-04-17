package task4;

// Создаём свои классы исключений
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArraySumCalculator {
    
    // Метод, который суммирует элементы массива 4x4
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверяем размер массива
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива: ожидается 4 строки, получено " + array.length);
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива: в строке " + i + " ожидается 4 элемента, получено " + array[i].length);
            }
        }
        
        int sum = 0;
        
        // Проходим по всем элементам и суммируем
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать в число: ячейка [" + i + "][" + j + "] содержит '" + array[i][j] + "'");
                }
            }
        }
        
        return sum;
    }
    
    // Метод для демонстрации ArrayIndexOutOfBoundsException
    public static void demonstrateArrayIndexOutOfBounds() {
        System.out.println("\n=== Демонстрация ArrayIndexOutOfBoundsException ===");
        
        int[] arr = {1, 2, 3, 4, 5};
        
        try {
            // Пытаемся обратиться к индексу, которого нет
            System.out.println("Пытаемся получить элемент с индексом 10...");
            int element = arr[10];
            System.out.println("Элемент: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение ArrayIndexOutOfBoundsException!");
            System.out.println("Сообщение: " + e.getMessage());
            System.out.println("Нельзя обратиться к индексу, которого нет в массиве.");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Тестирование метода sumArray ===\n");
        
        // Пример 1: правильный массив 4x4
        String[][] correctArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        
        try {
            int sum = sumArray(correctArray);
            System.out.println("Пример 1 (правильный массив):");
            System.out.println("Сумма всех элементов = " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Пример 2: массив неправильного размера (3x4)
        String[][] wrongSizeArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"}
        };
        
        try {
            int sum = sumArray(wrongSizeArray);
            System.out.println("\nПример 2 (неправильный размер):");
            System.out.println("Сумма всех элементов = " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("\nПример 2 (неправильный размер):");
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Пример 3: массив с некорректными данными
        String[][] invalidDataArray = {
            {"1", "2", "3", "4"},
            {"5", "шесть", "7", "8"},  // "шесть" — не число
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        
        try {
            int sum = sumArray(invalidDataArray);
            System.out.println("\nПример 3 (некорректные данные):");
            System.out.println("Сумма всех элементов = " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("\nПример 3 (некорректные данные):");
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Демонстрация ArrayIndexOutOfBoundsException
        demonstrateArrayIndexOutOfBounds();
    }
}