public class List<E> {
    private Node<E> first, last;

    public boolean isEmpty() {
        return first == null;
    }

    public void pushInit(E info) {
        Node<E> newNode = new Node<E>(info);
        if (isEmpty())
            last = newNode;
        else {
            newNode.setNext(first);
            first.setBack(newNode);
        }
        first = newNode;
    }

    public void pushEnd(E info) {
        Node<E> newNode = new Node<E>(info);
        if (isEmpty())
            first = newNode;
        else {
            newNode.setBack(last);
            last.setNext(newNode);
        }
        last = newNode;
    }

    public E popInit() {
        if (isEmpty())
            return null;

        E aux = first.getInfo();
        if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.getNext();
            first.setBack(null);
        }
        return aux;
    }

    public E popEnd() {
        if (isEmpty())
            return null;

        E aux = last.getInfo();
        if (first == last) {
            first = null;
            last = null;
        } else {
            last = last.getBack();
            last.setNext(null);
        }
        return aux;
    }

    public E pop(int index) throws NullPointerException {
        if (index > size() - 1 || index < 0)
            throw new NullPointerException("Digite um index valido");

        Node<E> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        E aux = currentNode.getInfo();
        currentNode.getBack().setNext(currentNode.getNext());

        return aux;
    }

    public void push(int index, E info) {
        Node<E> currentNode = first;
        Node<E> newNode = new Node<E>(info);
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        newNode.setNext(currentNode);
        currentNode.setBack(newNode);
    }

    public boolean removeElement(E info) {
        if (isEmpty())
            return false;

        Node<E> currentNode = first;
        while (currentNode != null) {
            if (currentNode.getInfo().equals(info)) {
                currentNode.getBack().setNext(currentNode.getNext());
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }

    public boolean contains(E info) {
        if (isEmpty())
            return false;
        Node<E> currentNode = first;
        while (currentNode != null) {
            if (currentNode.getInfo().equals(info))
                return true;
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public int size() {
        int i = 0;
        Node<E> currentNode = first;
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
        Node<E> currentNode = first;
        while (currentNode != null) {
            s += currentNode + " -> ";
            currentNode = currentNode.getNext();
        }
        return s += "///";
    }
}
