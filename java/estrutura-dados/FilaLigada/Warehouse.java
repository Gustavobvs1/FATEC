public class Warehouse {

    public static void main(String[] args) {

        LinkedLineProducts track = new LinkedLineProducts();
        Product[] shelf = new Product[100];

        track.queue(new Product(1, "pasta"));
        track.queue(new Product(2, "lente"));
        track.queue(new Product(10, "paraquedas"));

        int i = 0;
        while (!track.isEmpty()) {
            shelf[i] = track.dequeue();
            i++;
        }

        shelf[2].updateStock(20);

        for (int j = 0; j < i; j++)
            System.out.println(shelf[j]);
    }

}
