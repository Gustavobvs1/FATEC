public class LinkedStack {
    private Node first;

    public boolean isEmpty() {
        return first == null;
    }

    public void push(int info) {
        Node newNode = new Node(info);
        if (!isEmpty())
            newNode.setNext(first);

        first = newNode;
    }

    public int pop() {
        if (isEmpty())
            return -1;

        int aux = first.getInfo();

        first = first.getNext();

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

    public int find(int x) {
        if (!isEmpty()) {
            int i = 0;
            Node currentNode = first;

            while (currentNode != null) {
                if (currentNode.getInfo() == x)
                    return i;
                i++;
                currentNode = currentNode.getNext();
            }
        }
        return -1;
    }

    public LinkedStack clone() {
        LinkedStack newStack = new LinkedStack();
        if (!isEmpty()) {
            Node currentNode = first;

            while (currentNode != null) {
                newStack.push(currentNode.getInfo());
                currentNode = currentNode.getNext();
            }
        }

        return newStack;
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
