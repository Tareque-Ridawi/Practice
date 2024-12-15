public class Product {

    // Class attributes (fields)
    private String name; // Private for encapsulation
    private double price; // Private for controlled access

    // Constant data field (final keyword)
    private static final double TAX_RATE = 0.05; // 5% tax, constant and shared by all instances

    // Constructor to initialize product details
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Accessor method (getter) for the name attribute
    public String getName() {
        return name;
    }

    // Mutator method (setter) for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Accessor method (getter) for the price attribute
    public double getPrice() {
        return price;
    }

    // Mutator method (setter) for the price attribute
    public void setPrice(double price) {
        if (price >= 0) { // Validation to ensure price is non-negative\n
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Method to calculate final price after tax (uses the constant TAX_RATE)
    public double calculateFinalPrice() {
        return price + (price * TAX_RATE);
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Final Price (with tax): $" + calculateFinalPrice());
    }

    // Main method to demonstrate functionality
    public static void accessClass(String[] args) {
        // Creating an instance of Product
        Product product = new Product("Laptop", 1200.0);

        // Using accessor methods to retrieve values
        System.out.println("Initial Product Name: " + product.getName());
        System.out.println("Initial Price: $" + product.getPrice());

        // Using mutator methods to update values
        product.setName("Gaming Laptop");
        product.setPrice(1500.0);

        // Displaying updated product details
        System.out.println("Updated Product Details:");
        product.displayDetails();

        // Attempting to set a negative price (validation in setter)
        product.setPrice(-500.0); // This will trigger a validation error
    }
}
