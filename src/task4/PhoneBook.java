package task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;
    
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    
    // Добавление записи (фамилия, телефон)
    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
        System.out.println("Добавлен: " + lastName + " -> " + phoneNumber);
    }
    
    // Поиск телефонов по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
    
    // Вывод всех записей
    public void printAll() {
        System.out.println("\nТелефонный справочник:");
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
