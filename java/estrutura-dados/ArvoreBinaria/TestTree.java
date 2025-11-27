import java.util.Random;

public class TestTree {
    public static void main(String[] args) {
        Tree newTree = new Tree();
        CompactTree compactTree = new CompactTree();
        newTree.insertValue(20);
        newTree.insertValue(32);
        newTree.insertValue(15);
        newTree.insertValue(5);
        newTree.insertValue(17);

        System.out.println(newTree.inOrder());
        System.out.println(newTree.countBetween(15, 30));
        System.out.println(newTree.isBinary());
    }
}
