public class List {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public void pushInit(int info) {
        Node newNode = new Node(info);
        if (!isEmpty())
            newNode.setNext(first);

        first = newNode;
    }

    public void pushEnd(int info) {
        Node newNode = new Node(info);
        if (isEmpty())
            first = newNode;

        else {
            Node currentNode = first;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public int removeInit() {
        if (isEmpty())
            return -1;

        int aux = first.getInfo();

        first = first.getNext();

        return aux;
    }

    public int removeEnd() {
        if (isEmpty())
            return -1;
        else if (first.getNext() == null) {
            int info = first.getInfo();
            first = null;
            return info;
        }

        Node currentNode = first;
        while (currentNode.getNext().getNext() != null) {
            currentNode = currentNode.getNext();
        }
        int aux = currentNode.getNext().getInfo();
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
