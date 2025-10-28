public class CompactTree {
    private CompactNode root;

    public boolean isEmpty() {
        return this.root == null;
    }

    public void insertValue(int info) {
        if (isEmpty())
            this.root = new CompactNode(info);
        else
            insertValueRecursive(info, root);
    }

    private void insertValueRecursive(int info, CompactNode currentNode) {

        if (info == currentNode.getInfo())
            currentNode.setQuantity(currentNode.getQuantity() + 1);
        else if (info > currentNode.getInfo()) {
            if (currentNode.getRight() == null)
                currentNode.setRight(new CompactNode(info));
            else
                insertValueRecursive(info, currentNode.getRight());
        } else {
            if (currentNode.getLeft() == null)
                currentNode.setLeft(new CompactNode(info));
            else
                insertValueRecursive(info, currentNode.getLeft());
        }
    }

    public String inOrder() {
        if (isEmpty())
            return "Árvore vazia";
        return inOrderRecursive(root);
    }

    private String inOrderRecursive(CompactNode currentNode) {
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

    private String preOrderRecursive(CompactNode currentNode) {
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

    private String postOrderRecursive(CompactNode currentNode) {
        if (currentNode != null)
            return postOrderRecursive(currentNode.getLeft()) + postOrderRecursive(currentNode.getRight()) + currentNode;
        else
            return "";
    }

    public void invertTree() {
        invertTreeRecursive(root);
    }

    private void invertTreeRecursive(CompactNode currentNode) {
        if (currentNode != null) {
            CompactNode temp = currentNode.getLeft();
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

    private boolean binarySearchRecursive(int info, CompactNode currentNode) {
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

    public int maxInfo() {
        if (isEmpty())
            return -1;
        return maxInfoRecursive(root);
    }

    private int maxInfoRecursive(CompactNode currentNode) {
        if (currentNode.getRight() != null)
            return maxInfoRecursive(currentNode.getRight());
        return currentNode.getInfo();
    }

    public int minInfo() {
        if (isEmpty())
            return -1;
        return minInfoRecursive(root);
    }

    private int minInfoRecursive(CompactNode currentNode) {
        if (currentNode.getLeft() != null)
            return minInfoRecursive(currentNode.getLeft());
        return currentNode.getInfo();
    }

    public int countNodes() {
        if (isEmpty())
            return 0;
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(CompactNode currentNode) {
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

    private int getHeightRecursive(CompactNode currentNode) {
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

    private int countLeavesRecursive(CompactNode currentNode) {
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

    private int getSumOfNodesRecursive(CompactNode currentNode) {
        int sum = 0;

        if (currentNode.getLeft() != null)
            sum += getSumOfNodesRecursive(currentNode.getLeft());
        if (currentNode.getRight() != null)
            sum += getSumOfNodesRecursive(currentNode.getRight());

        return sum += currentNode.getInfo();
    }
}

class CompactNode {
    private int info, quantity;
    private CompactNode left, right;

    public CompactNode(int info) {
        this.info = info;
        this.quantity = 1;
    }

    public CompactNode getLeft() {
        return left;
    }

    public void setLeft(CompactNode left) {
        this.left = left;
    }

    public CompactNode getRight() {
        return right;
    }

    public void setRight(CompactNode right) {
        this.right = right;
    }

    public int getInfo() {
        return info;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[value:" + info + ", quantity:" + quantity + "]";
    }

}