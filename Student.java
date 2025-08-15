class Student extends User {
    public Student(String name) {
        super(name);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Student " + getName() + " is borrowing a book:");
        book.borrowBook();
    }
}

class Teacher extends User {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Teacher " + getName() + " is borrowing a book:");
        book.borrowBook();
    }
}

