public class Node<E> {
    private E info;
    private Node<E> next;
    private Node<E> back;

    public Node(E info) {
        this.info = info;
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getBack() {
        return back;
    }

    public void setBack(Node<E> back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "[" + info + "]";
    }
}
