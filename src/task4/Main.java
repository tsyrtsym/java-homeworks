package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1: Студенты ===\n");
        
        // Создаём список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов Иван", "Группа А", 1, Arrays.asList(5, 4, 5, 4, 5)));
        students.add(new Student("Петров Пётр", "Группа Б", 2, Arrays.asList(2, 3, 2, 2, 3)));
        students.add(new Student("Сидорова Анна", "Группа А", 1, Arrays.asList(5, 5, 5, 4, 5)));
        students.add(new Student("Козлов Дмитрий", "Группа В", 3, Arrays.asList(3, 3, 4, 3, 4)));
        students.add(new Student("Смирнова Елена", "Группа Б", 2, Arrays.asList(2, 2, 2, 3, 2)));
        
        System.out.println("Список всех студентов:");
        for (Student s : students) {
            System.out.println("  " + s);
        }
        
        System.out.println("\n--- Удаление студентов с баллом < 3 ---");
        StudentManager.removePoorStudents(students);
        
        System.out.println("\n--- Перевод студентов с баллом >= 3 на следующий курс ---");
        StudentManager.promoteStudents(students);
        
        System.out.println("\n--- Оставшиеся студенты после операций ---");
        for (Student s : students) {
            System.out.println("  " + s);
        }
        
        // Используем Set для printStudents
        Set<Student> studentSet = new HashSet<>(students);
        StudentManager.printStudents(studentSet, 2);
        StudentManager.printStudents(studentSet, 3);
        
        System.out.println("\n\n=== Задание 2: Телефонный справочник ===\n");
        
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+7-123-456-78-90");
        phoneBook.add("Петров", "+7-234-567-89-01");
        phoneBook.add("Иванов", "+7-345-678-90-12");
        phoneBook.add("Сидоров", "+7-456-789-01-23");
        phoneBook.add("Иванов", "+7-567-890-12-34");
        
        phoneBook.printAll();
        
        System.out.println("\nПоиск телефонов по фамилии 'Иванов':");
        List<String> phones = phoneBook.get("Иванов");
        for (String phone : phones) {
            System.out.println("  " + phone);
        }
        
        System.out.println("\nПоиск телефонов по фамилии 'Петров':");
        phones = phoneBook.get("Петров");
        for (String phone : phones) {
            System.out.println("  " + phone);
        }
        
        System.out.println("\nПоиск телефонов по фамилии 'Смирнов' (нет в справочнике):");
        phones = phoneBook.get("Смирнов");
        if (phones.isEmpty()) {
            System.out.println("  Записей не найдено");
        }
    }
}
