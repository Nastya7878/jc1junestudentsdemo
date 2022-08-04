public class Student implements Comparable<Student> {
  int number;
  String name;
  String surname;
  int groupNumber;
  int course;


  public Student(int number, String name, String surname, int groupNumber, int course) {
    this.number = number;
    this.name = name;
    this.surname = surname;
    this.groupNumber = groupNumber;
    this.course = course;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getGroupNumber() {
    return groupNumber;
  }

  public void setGroupNumber(int groupNumber) {
    this.groupNumber = groupNumber;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  @Override
  public String toString() {
    return "Student{" +
            "number=" + number +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", groupNumber=" + groupNumber +
            ", course=" + course +
            '}';
  }

  @Override
  public int compareTo(Student o) {
    return this.number - o.number;
  }
}

