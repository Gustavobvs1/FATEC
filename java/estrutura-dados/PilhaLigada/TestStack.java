package PilhaLigada;

import java.util.Random;

public class TestStack {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        Random random = new Random();

        do {
            if (random.nextBoolean()) {
                stack.push(random.nextInt(10));
            } else {
                if (!stack.isEmpty())
                    System.out.println(stack.pop() + " foi desempilhado");
            }
            System.out.println(stack);
        } while (!stack.isEmpty());
    }
}
