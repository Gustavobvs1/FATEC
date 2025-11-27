public class Warehouse {

    public static void main(String[] args) {

        LinkedLineProducts track = new LinkedLineProducts();
        Product[] shelf = new Product[100];

        track.queue(new Product(1, "pasta", 39));
        track.queue(new Product(2, "lente", 1));
        track.queue(new Product(10, "paraquedas", 4));

        System.out.println(track.stockSum());
    }

}
