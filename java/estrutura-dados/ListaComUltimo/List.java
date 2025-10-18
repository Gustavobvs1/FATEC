public class List {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public void pushInit(int info) {
        Node newNode = new Node(info);
        if (isEmpty())
            last = newNode;
        else
            newNode.setNext(first);

        first = newNode;
    }

    public void pushEnd(int info) {
        Node newNode = new Node(info);
        if (isEmpty())
            first = newNode;

        else
            newNode.setNext(last);

        last = newNode;

    }

    public int removeInit() {
        if (isEmpty())
            return -1;

        int aux = first.getInfo();

        first = first.getNext();
        if (isEmpty())
            last = null;

        return aux;
    }

    public int removeEnd() {
        if (isEmpty())
            return -1;
        if (first.getNext() == null) {
            int info = first.getInfo();
            first = null;
            return info;
        }

        Node currentNode = first;
        while (currentNode.getNext().getNext() != null) {
            currentNode = currentNode.getNext();
        }
        int aux = last.getInfo();
        last = currentNode;
        currentNode.setNext(null);
        return aux;
    }

    public int size() {
        int i = 0;
        Node currentNode = first;
        while (currentNode != null) {
            i++;
            currentNode = currentNode.getNext();
        }
        return i;
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
        return s;
    }
}
