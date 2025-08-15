
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee(101, "Tanzim");
        Employee obj2 = new Employee(102, "Nabil");

        obj1.displayInfo();
        obj2.displayInfo();
    }
}
