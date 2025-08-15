public class OOPProject {
    public static void main(String[] args) {
        // Create Books
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Python Programming", "Guido van Rossum");

        // Create Library
        Book[] bookList = {b1, b2};
        Library library = new Library(bookList);

        // Create Users
        User student = new Student("Tanzim");
        User teacher = new Teacher("Mr. Karim");

        // Borrow books
        student.borrowBook(b1);  // Student borrows
        teacher.borrowBook(b1);  // Teacher tries to borrow same book

        // Return books
        b1.returnBook();
        teacher.borrowBook(b1);  // Teacher borrows after return
    }
}

