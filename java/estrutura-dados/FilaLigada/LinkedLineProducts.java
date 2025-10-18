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
