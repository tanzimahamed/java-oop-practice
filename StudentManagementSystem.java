// 1. Encapsulation
class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
}

// 2. Inheritance
class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String name, int age, String department, String thesisTitle) {
        super(name, age, department);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() { return thesisTitle; }
}

// 3. Abstraction
abstract class StudentService {
    abstract void displayDetails(Student s);
}

// 4. Polymorphism
class StudentDisplayService extends StudentService {
    @Override
    void displayDetails(Student s) {
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Department: " + s.getDepartment());

        if (s instanceof GraduateStudent) {
            System.out.println("Thesis: " + ((GraduateStudent) s).getThesisTitle());
        }
        System.out.println("-------------------");
    }
}

// Main Class
public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Rahim", 20, "CSE");
        GraduateStudent s2 = new GraduateStudent("Karim", 24, "EEE", "Smart Grid Systems");

        StudentService service = new StudentDisplayService();
        service.displayDetails(s1);
        service.displayDetails(s2);
    }
}

