public class LinkedLineProducts {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public void queue(Product product) {
        Node newNode = new Node(product);
        if (isEmpty())
            first = newNode;
        else
            last.setNext(newNode);
        last = newNode;
    }

    public Product dequeue() {
        if (isEmpty())
            return null;

        Product temp = first.getInfo();
        first = first.getNext();
        if (first == null)
            last = null;
        return temp;
    }

    public Product findByName(String name) {
        if (!isEmpty()) {
            Node currentNode = first;
            while (currentNode != null) {
                if (currentNode.getInfo().getName() == name)
                    return currentNode.getInfo();
                currentNode = currentNode.getNext();
            }
        }

        return null;
    }

    public int stockSum() {

        if (isEmpty())
            return 0;
        Node currentNode = first;
        int sum = 0;
        while (currentNode != null) {
            sum += currentNode.getInfo().getStock();
            currentNode = currentNode.getNext();
        }

        return sum;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "Lista está vazia\n";
        String s = "";
        Node currentNode = first;
        while (currentNode != null) {
            s += currentNode + " -> ";
            currentNode = currentNode.getNext();
        }
        return s + "//";
    }
}
