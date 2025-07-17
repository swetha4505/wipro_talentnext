package java_fundamentals;

class book {
    private String name;
    private author author; 
    private double price;
    private int qtyInStock;
    public book(String name, author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }

    public author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(author author) {
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
        return "Book Name: " + name + "\n" +
               author.toString() + "\n" +
               "Price: ₹" + price + "\n" +
               "Quantity in Stock: " + qtyInStock;
    }
}