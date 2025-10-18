public class Node {
    private Product info;
    private Node next;

    public Node(Product info) {
        this.info = info;
    }

    public Product getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return " [ " + info + " ]";
    }

}
