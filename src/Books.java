public class Books {
    private String author;
    private String title;
    private double price;
    private String publisherNumber;

    public Books(String author, String title, double price, String publisherNumber) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisherNumber = publisherNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisherNumber() {
        return publisherNumber;
    }

    public void setPublisherNumber(String publisherNumber) {
        this.publisherNumber = publisherNumber;
    }

    public static double calculatePrice(Books ...books) {
        double totalPrice = 0;
        for (Books book: books) {
            totalPrice += book.getPrice();
        }

        return totalPrice;
    }

}