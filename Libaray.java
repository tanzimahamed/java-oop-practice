class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    // Method Overloading: Search by title
    public Book searchBook(String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    // Method Overloading: Search by author
    public void searchBookByAuthor(String author) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(author)) {
                System.out.println("Book found: " + book.getTitle());
            }
        }
    }
}

