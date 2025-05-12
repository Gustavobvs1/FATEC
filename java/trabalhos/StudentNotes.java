import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentNotes {
    public static void main(String[] args) {

        boolean running = true;
        ArrayList notes = new ArrayList<Double>();

        while (running) {
            try {
                System.out.println(
                        "\n---------------------------------------------------------------------------------------------------------");
                System.out.println("1.Ver notas");
                System.out.println("2.Adicionar nota");
                System.out.println("3.Verificar nota em índice específico");
                System.out.println("4.Sair");

                int option = selectOption();

                switch (option) {
                    case 1:
                        getNotes(notes);
                        break;

                    case 2:
                        notes.add(addNote());
                        break;

                    case 3:
                        getNoteByIndex(notes);
                        break;

                    case 4:
                        running = false;
                        break;

                    default:
                        System.out.println("\nDigite um número valido!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n\nErro: Digite apenas números! ");

            } catch (IndexOutOfBoundsException e) {
                System.out.println("\n\nErro: Índice invalído ou lista vazia!");
            } catch (NoSuchElementException e) {
                System.out.println("\n\nErro: Digite um número valido!");
            }
        }
    }

    public static int selectOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o número do que deseja fazer: ");
        int option = scanner.nextInt();

        return option;
    }

    public static void getNotes(ArrayList<Double> notes) {
        if (notes.size() > 0) {
            System.out.println("\nNotas: ");
            for (double note : notes) {
                System.out.println(note);
            }
        } else
            System.out.println("\nLista vazia");
    }

    public static double addNote() {
        Scanner scanner = new Scanner(System.in);
        double newNote = 0;

        do {
            if (newNote < 0 || newNote > 10)
                System.out.println("\nNota invalida!\n");
            System.out.print("Digite uma nota de 0 a 10: ");
            newNote = scanner.nextInt();

        } while (newNote < 0 || newNote > 10);

        return newNote;
    }

    public static void getNoteByIndex(ArrayList<Double> notes) {
        Scanner scanner = new Scanner(System.in);

        if (notes.size() > 0) {
            System.out.print("Digite um índice de 0 a " + (notes.size() - 1) + ": ");
            int index = scanner.nextInt();

            System.out.println("\n" + notes.get(index));

        } else
            System.out.println("\nLista vazia");
    }
}
