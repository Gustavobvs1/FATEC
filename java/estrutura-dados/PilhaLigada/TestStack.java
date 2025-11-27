import java.util.Random;

public class TestStack {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        // Random random = new Random();

        // do {
        // if (random.nextBoolean()) {
        // stack.push(random.nextInt(10));
        // } else {
        // if (!stack.isEmpty())
        // System.out.println(stack.pop() + " foi desempilhado");
        // }
        // System.out.println(stack);
        // } while (!stack.isEmpty());

        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.clone());
    }
}
