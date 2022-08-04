import java.util.TreeSet;

public class StudentUtil {

  public static TreeSet<Student> studentsExample() {

    TreeSet<Student> students = new TreeSet<>();

    Student student1 = new Student(1, "Сергей", "Веремейчик", 106419, 3);
    Student student2 = new Student(2, "Анастасия", "Бурая", 108418, 2);
    Student student3 = new Student(3, "Юрий", "Лосев", 103329, 1);
    Student student4 = new Student(4, "Надежда", "Демидова", 106214, 4);
    Student student5 = new Student(5, "Сергей", "Бородавкин", 101119, 5);
    Student student6 = new Student(6, "Андрей", "Матусевич", 107155, 3);
    Student student7 = new Student(7, "Артем", "Гусев", 103330, 1);
    Student student8 = new Student(8, "Анна", "Таратухина", 109116, 5);


    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);
    students.add(student6);
    students.add(student7);
    students.add(student8);

    return students;

  }
}




