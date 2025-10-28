import java.util.Random;

public class TestTree {
    public static void main(String[] args) {
        Tree newTree = new Tree();
        CompactTree compactTree = new CompactTree();
        int[] array = new int[200];
        for (int i = 0; i < 200; i++) {
            Random random = new Random();
            array[i] = random.nextInt(99);

            newTree.insertValue(array[i]);
            compactTree.insertValue(array[i]);
        }

        System.out.println(compactTree.inOrder());
        System.out.println(compactTree.getHeight());
        System.out.println("\n");
        System.out.println(newTree.inOrder());
        System.out.println(newTree.getHeight());
    }
}
