// Class to represent a Book
class bookCost {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Overriding the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", Price: $" + price + "]";
    }

    // Method to update the price of the book
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
}

// Main class to demonstrate passing objects as parameters
public class ToStringAndObjectPassing {
    // Static method to update the book's price by passing the object
    public static void modifyBook(Book book, double discount) {
        double discountedPrice = book.price - (book.price * discount);
        book.updatePrice(discountedPrice); // Modify the object's attribute
    }

    public static void main(String[] args) {
        // Creating a Book object
        Book myBook = new Book("Effective Java", "Joshua Bloch", 45.99);

        // Displaying the book details using the overridden toString() method
        System.out.println("Before discount: " + myBook);

        // Passing the Book object to a method to apply a discount
        modifyBook(myBook, 0.1); // Apply a 10% discount

        // Displaying the updated book details
        System.out.println("After discount: " + myBook);
    }
}
