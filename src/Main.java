public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        double luasLingkaran = lingkaran.getLuas();
        double kelilingLingkaran = lingkaran.getKeliling();
        System.out.println("Luas Lingkaran : " + luasLingkaran);
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran);

        System.out.println();
        System.out.println();
        System.out.println();

        Books book1 = new Books("Jono", "Book 1", 250000, "P123");
        Books book2 = new Books("Udin", "Book 2", 50000, "P456");
        Books book3 = new Books("Samsul", "Book 3", 80000, "P459");

        // Calculate the total price
        double totalPrice = Books.calculatePrice(book1, book2, book3);

        // Print the total price
        System.out.println("Total price of books: Rp. " + totalPrice);

    }
}