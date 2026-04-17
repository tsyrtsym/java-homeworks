package task4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StudentManager {
    
    // Метод удаляет студентов со средним баллом < 3
    public static void removePoorStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                System.out.println("Удалён студент: " + student.getName() + " (средний балл: " + student.getAverageGrade() + ")");
                iterator.remove();
            }
        }
    }
    
    // Метод переводит студента на следующий курс, если средний балл >= 3
    public static void promoteStudents(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                int newCourse = student.getCourse() + 1;
                student.setCourse(newCourse);
                System.out.println("Студент " + student.getName() + " переведён на " + newCourse + " курс");
            }
        }
    }
    
    // Метод печатает имена студентов на заданном курсе
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("\nСтуденты на " + course + " курсе:");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("  - " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("  Студентов на этом курсе нет");
        }
    }
}
