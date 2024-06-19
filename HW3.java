class Student {
    int id;
    String name;
    String surname;

    public Student(String name) {
        this.name = name;
        System.out.println("Ad: " + name);
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Ad: " + name + ", Soyad: " + surname);
    }
}

public class HW3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println();

        Student student2 = new Student("Bob");
        System.out.println();

        Student student3 = new Student("Ayla", "Sabir");
        System.out.println();

        System.out.println("Deyərlər:");
        System.out.println("Student 1: id=" + student1.id + ", name=" + student1.name + ", surname=" + student1.surname);
        System.out.println("Student 2: id=" + student2.id + ", name=" + student2.name + ", surname=" + student2.surname);
        System.out.println("Student 3: id=" + student3.id + ", name=" + student3.name + ", surname=" + student3.surname);
        System.out.println();

        student1 = null;

        student2 = student3;
    }
}
