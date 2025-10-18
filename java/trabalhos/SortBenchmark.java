import java.util.*;

public class SortBenchmark {

    public static void main(String[] args) {
        int[] sizes = {2000, 4000, 8000, 12000, 16000};
        String[] algorithms = {"BubbleSort", "InsertionSort", "SelectionSort", "QuickSort", "MergeSort"};
        Random random = new Random();

        System.out.println("=== Benchmark de Algoritmos de Ordenação (Tempo Médio em nanossegundos) ===");
        System.out.printf("%-15s %-10s %-20s%n", "Algoritmo", "Tamanho", "Tempo Médio (ns)");
        System.out.println("-----------------------------------------------------------------------");

        for (int size : sizes) {
            int[] baseArray = new int[size];
            for (int i = 0; i < size; i++) baseArray[i] = random.nextInt(size * 10);

            for (String algorithm : algorithms) {
                long totalTime = 0;

                for (int t = 0; t < 10; t++) {
                    int[] arr = Arrays.copyOf(baseArray, baseArray.length);
                    long start = System.nanoTime();

                    switch (algorithm) {
                        case "BubbleSort":
                            bubbleSort(arr);
                            break;
                        case "InsertionSort":
                            insertionSort(arr);
                            break;
                        case "SelectionSort":
                            selectionSort(arr);
                            break;
                        case "QuickSort":
                            quickSort(arr, 0, arr.length - 1);
                            break;
                        case "MergeSort":
                            mergeSort(arr, 0, arr.length - 1);
                            break;
                    }

                    long end = System.nanoTime();
                    totalTime += (end - start);
                }

                long avgTime = totalTime / 10;
                System.out.printf("%-15s %-10d %-20d%n", algorithm, size, avgTime);
            }
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Benchmark concluído com sucesso!");
    }

    // -------- Algoritmos --------

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
