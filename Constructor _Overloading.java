class Student {
    String name;
    int age;

    // Constructor 1 (No parameter)
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2 (Only name)
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor 3 (Name + Age)
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Student s1 = new Student();                // No parameter
        Student s2 = new Student("Tanzim");        // Only name
        Student s3 = new Student("Rahim", 21);     // Name + Age

        s1.display();
        s2.display();
        s3.display();
    }
}
