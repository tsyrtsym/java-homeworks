public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. printThreeWords ===");
        printThreeWords();

        System.out.println("\n=== 2. checkSumSign ===");
        checkSumSign();

        System.out.println("\n=== 3. printColor ===");
        printColor();

        System.out.println("\n=== 4. compareNumbers ===");
        compareNumbers();

        System.out.println("\n=== 5. isSumBetween10And20 ===");
        System.out.println("Сумма 5 и 10 (15): " + isSumBetween10And20(5, 10));
        System.out.println("Сумма 1 и 1 (2): " + isSumBetween10And20(1, 1));

        System.out.println("\n=== 6. checkPositiveOrNegative ===");
        checkPositiveOrNegative(-5);
        checkPositiveOrNegative(0);
        checkPositiveOrNegative(7);

        System.out.println("\n=== 7. isNegative ===");
        System.out.println("-3 отрицательное? " + isNegative(-3));
        System.out.println("0 отрицательное? " + isNegative(0));
        System.out.println("5 отрицательное? " + isNegative(5));

        System.out.println("\n=== 8. printStringNTimes ===");
        printStringNTimes("Hello", 3);

        System.out.println("\n=== 9. isLeapYear ===");
        System.out.println("2024 високосный? " + isLeapYear(2024));
        System.out.println("1900 високосный? " + isLeapYear(1900));
        System.out.println("2000 високосный? " + isLeapYear(2000));

        System.out.println("\n=== 10. invertArray ===");
        invertArray();

        System.out.println("\n=== 11. fillArray ===");
        fillArray();

        System.out.println("\n=== 12. multiplyLessThanSix ===");
        multiplyLessThanSix();

        System.out.println("\n=== 13. fillDiagonal ===");
        fillDiagonal();

        System.out.println("\n=== 14. createArray ===");
        int[] newArr = createArray(5, 10);
        System.out.print("Массив длиной 5 со значением 10: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 15;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Было: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.print("\nСтало: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Первые 10 элементов: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("...");
    }

    public static void multiplyLessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Было: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.print("\nСтало (числа <6 умножены на 2): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int size = 5;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
        }
        System.out.println("Квадратный массив 5x5 с единицами на диагонали:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}