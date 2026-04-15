public class Main {
    public static void main(String[] args) {
        System.out.println("========== ЗАДАНИЕ 1 И 2 ==========");
        // Создаём массив из 5 товаров
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);

        productsArray[1] = new Product("iPhone 16 Pro", "15.03.2025",
                "Apple Inc.", "USA", 5999, false);

        productsArray[2] = new Product("Xiaomi 14", "10.01.2025",
                "Xiaomi", "China", 3499, true);

        productsArray[3] = new Product("Google Pixel 9", "20.02.2025",
                "Google", "USA", 4999, false);

        productsArray[4] = new Product("Nokia 3310", "05.05.2024",
                "Nokia", "Finland", 999, true);

        // Выводим информацию о каждом товаре
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар " + (i + 1) + ":");
            productsArray[i].displayInfo();
        }

        System.out.println("\n========== ЗАДАНИЕ 3 ==========");
        // Создаём объект парка
        Park park = new Park();

        // Создаём аттракционы через внутренний класс
        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00-22:00", 500);
        Park.Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "10:00-21:00", 300);
        Park.Attraction bumperCars = park.new Attraction("Автодром", "11:00-20:00", 250);

        // Выводим информацию об аттракционах
        rollerCoaster.displayInfo();
        ferrisWheel.displayInfo();
        bumperCars.displayInfo();
    }
}