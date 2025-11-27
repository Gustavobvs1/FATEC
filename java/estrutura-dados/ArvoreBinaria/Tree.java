public class Tree {
    private Node root;

    public Boolean isEmpty() {
        return this.root == null;
    }

    public void insertValue(int info) {
        if (isEmpty())
            this.root = new Node(info);
        else
            insertValueRecursive(root, info);
    }

    private void insertValueRecursive(Node currentNode, int info) {
        if (info > currentNode.getInfo()) {
            if (currentNode.getRight() == null)
                currentNode.setRight(new Node(info));
            else
                insertValueRecursive(currentNode.getRight(), info);
        } else {
            if (currentNode.getLeft() == null)
                currentNode.setLeft(new Node(info));
            else
                insertValueRecursive(currentNode.getLeft(), info);
        }
    }

    public String inOrder() {
        if (isEmpty())
            return "Árvore vazia";
        return inOrderRecursive(root);
    }

    private String inOrderRecursive(Node currentNode) {
        if (currentNode != null)
            return inOrderRecursive(currentNode.getLeft()) + currentNode + inOrderRecursive(currentNode.getRight());
        else
            return "";
    }

    public String preOrder() {
        if (isEmpty())
            return "Árvore vazia";
        return preOrderRecursive(root);
    }

    private String preOrderRecursive(Node currentNode) {
        if (currentNode != null)
            return currentNode + preOrderRecursive(currentNode.getLeft()) + preOrderRecursive(currentNode.getRight());
        else
            return "";
    }

    public String postOrder() {
        if (isEmpty())
            return "Árvore vazia";
        return postOrderRecursive(root);
    }

    private String postOrderRecursive(Node currentNode) {
        if (currentNode != null)
            return postOrderRecursive(currentNode.getLeft()) + postOrderRecursive(currentNode.getRight()) + currentNode;
        else
            return "";
    }

    public void invertTree() {
        invertTreeRecursive(root);
    }

    private void invertTreeRecursive(Node currentNode) {
        if (currentNode != null) {
            Node temp = currentNode.getLeft();
            currentNode.setLeft(currentNode.getRight());
            currentNode.setRight(temp);

            invertTreeRecursive(currentNode.getLeft());
            invertTreeRecursive(currentNode.getRight());
        }
    }

    public boolean binarySearch(int info) {
        if (isEmpty())
            return false;
        return binarySearchRecursive(info, root);
    }

    private boolean binarySearchRecursive(int info, Node currentNode) {
        if (info == currentNode.getInfo())
            return true;
        else if (info > currentNode.getInfo()) {
            if (currentNode.getRight() == null)
                return false;
            return binarySearchRecursive(info, currentNode.getRight());
        } else {
            if (currentNode.getLeft() == null)
                return false;
            return binarySearchRecursive(info, currentNode.getLeft());
        }
    }

    public int countQuantity(int info) {
        if (isEmpty())
            return 0;
        return countQuantityRecursive(info, root);
    }

    private int countQuantityRecursive(int info, Node currentNode) {

        int i = 0;
        if (info == currentNode.getInfo()) {
            i++;
        }
        if (info > currentNode.getInfo()) {
            if (currentNode.getRight() != null)
                i += countQuantityRecursive(info, currentNode.getRight());
        } else {
            if (currentNode.getLeft() != null)
                i += countQuantityRecursive(info, currentNode.getLeft());
        }

        return i;
    }

    public int maxInfo() {
        if (isEmpty())
            return -1;
        return maxInfoRecursive(root);
    }

    private int maxInfoRecursive(Node currentNode) {
        if (currentNode.getRight() != null)
            return maxInfoRecursive(currentNode.getRight());
        return currentNode.getInfo();
    }

    public int minInfo() {
        if (isEmpty())
            return -1;
        return minInfoRecursive(root);
    }

    private int minInfoRecursive(Node currentNode) {
        if (currentNode.getLeft() != null)
            return minInfoRecursive(currentNode.getLeft());
        return currentNode.getInfo();
    }

    public int countNodes() {
        if (isEmpty())
            return 0;
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(Node currentNode) {
        int i = 1;
        if (currentNode.getLeft() != null)
            i += countNodesRecursive(currentNode.getLeft());
        if (currentNode.getRight() != null)
            i += countNodesRecursive(currentNode.getRight());
        return i;
    }

    public int getHeight() {
        if (isEmpty())
            return -1;
        return getHeightRecursive(root);
    }

    private int getHeightRecursive(Node currentNode) {
        int left = -1, right = -1;
        if (currentNode.getLeft() != null)
            left = getHeightRecursive(currentNode.getLeft());
        if (currentNode.getRight() != null)
            right = getHeightRecursive(currentNode.getRight());

        if (left > right)
            return left + 1;
        else
            return right + 1;
    }

    public int countLeaves() {
        if (isEmpty())
            return 0;
        return countLeavesRecursive(root);
    }

    private int countLeavesRecursive(Node currentNode) {
        int i = 0;
        if (currentNode.getRight() == null && currentNode.getLeft() == null)
            i++;
        else {
            if (currentNode.getLeft() != null)
                i += countLeavesRecursive(currentNode.getLeft());
            if (currentNode.getRight() != null)
                i += countLeavesRecursive(currentNode.getRight());
        }

        return i;
    }

    public int getSumOfNodes() {
        if (isEmpty())
            return 0;
        return getSumOfNodesRecursive(root);
    }

    private int getSumOfNodesRecursive(Node currentNode) {
        int sum = 0;

        if (currentNode.getLeft() != null)
            sum += getSumOfNodesRecursive(currentNode.getLeft());
        if (currentNode.getRight() != null)
            sum += getSumOfNodesRecursive(currentNode.getRight());

        return sum += currentNode.getInfo();
    }

    public int countBetween(int min, int max) {
        if (isEmpty())
            return 0;
        return countBetweenRecursive(min, max, root);
    }

    private int countBetweenRecursive(int min, int max, Node currentNode) {
        int i = 0;

        if (currentNode.getInfo() >= min && currentNode.getInfo() <= max)
            i++;

        if (currentNode.getLeft() != null)
            i += countBetweenRecursive(min, max, currentNode.getLeft());
        if (currentNode.getRight() != null)
            i += countBetweenRecursive(min, max, currentNode.getRight());

        return i;
    }

    public boolean isBinary() {
        if (isEmpty())
            return false;

        return isBinaryRecursive(root);
    }

    private boolean isBinaryRecursive(Node currentNode) {
        boolean isBinary;

        if (currentNode.getLeft() != null && currentNode.getRight() != null) {
            isBinary = isBinaryRecursive(currentNode.getLeft());
            if (isBinary)
                isBinary = isBinaryRecursive(currentNode.getRight());
        }

        else if (currentNode.getLeft() == null && currentNode.getRight() == null)
            isBinary = true;

        else
            isBinary = false;

        return isBinary;
    }

}

class Node {
    private int info;
    private Node left, right;

    public Node(int info) {
        this.info = info;
    }

    public Node getLeft() {
        return left;
    }

    public int getInfo() {
        return info;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "[" + info + "]";
    }
}
