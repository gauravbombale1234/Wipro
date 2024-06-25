/**
 * Problem: Encapsulation / Abstraction
 * 
 * Create a class Author with the following information.
 * Member variables: name (String), email (String), and gender (char)
 * Parameterized Constructor: To initialize the variables
 * 
 * Create a class Book with the following information.
 * Member variables: name (String), author (of the class Author you have just created), 
 *                   price (double), and qtyInStock (int)
 * [Assumption: Each book will be written by exactly one Author]
 * Parameterized Constructor: To initialize the variables
 * Getters and Setters for all the member variables
 * 
 * In the main method, create a book object and print all details of the book 
 * (including the author details)
 */

class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }

    public static void main(String[] args) {
        // Creating an Author object
        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');

        // Creating a Book object
        Book book = new Book("Harry Potter", author, 29.99, 100);

        // Printing all details of the book including the author details
        System.out.println(book);
    }
}
