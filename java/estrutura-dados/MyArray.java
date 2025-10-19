import java.util.Random;

public class MyArray {

    private int[] array;
    private int occupation;

    public MyArray() {
        array = new int[10];
        occupation = 0;
    }

    public MyArray(int capacity) {
        array = new int[capacity];
        occupation = 0;
    }

    private void swap(int a, int b) {
        array[a] ^= array[b];
        array[b] ^= array[a];
        array[a] ^= array[b];
    }

    private void swapNumbers(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
    }

    public int[] getArray() {
        return this.array;
    }

    public MyArray clone() {
        MyArray newVector = new MyArray(array.length);
        newVector.occupation = this.occupation;
        for (int i = 0; i < this.occupation; i++) {
            newVector.array[i] = array[i];
        }
        return newVector;
    }

    public void setValuePosition(int value, int position) {
        this.array[position] = value;
    }

    public void fillArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            this.array[i] = random.nextInt(array.length * 10);
        }
        occupation = array.length;
    }

    public int size() {
        return this.array.length;
    }

    // Busca simples
    public boolean contains(int value) {
        for (int i = 0; i < occupation; i++)
            if (value == array[i])
                return true;
        return false;
    }

    // Busca binaria
    public boolean binarySearch(int value) {
        int init = 0, end = array.length;

        while (init <= end) {
            int medium = (init + end) / 2;
            if (array[medium] == value)
                return true;
            if (array[medium] < value)
                init = medium + 1;
            else
                end = medium - 1;
        }
        return false;
    }

    public void bubbleSort() {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(j, j + 1);
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[pos])
                    pos = j;
            }
            if (pos != i)
                swap(i, pos);
        }
    }

    public void insertionSort() {
        for (int i = 1; i < array.length; ++i) {
            int v = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > v; --j)
                array[j + 1] = array[j];
            array[j + 1] = v;
        }
    }

    private int partition(int p, int r) {
        int x = array[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (array[j] <= x) {
                ++i;
                array[i] ^= array[j];
                array[j] ^= array[i];
                array[i] ^= array[j];
            }
        }
        i = i + 1;
        int aux = array[r];
        array[r] = array[i];
        array[i] = aux;
        return i;
    }

    public void quickSort(int p, int r) {
        if (p < r) {
            int q = partition(p, r);

            quickSort(p, q - 1);
            quickSort(q + 1, r);
        }
    }

    private void merge(int left, int right) {
        int rightHelper = right - left;

        int[] helper = new int[rightHelper + 1];
        for (int i = 0; i <= rightHelper; i++) {
            helper[i] = array[left + i];
        }

        int middleHelper = rightHelper / 2;
        int i = 0, j = middleHelper + 1, k = left;

        while (i <= middleHelper && j <= rightHelper) {
            if (helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }

            k++;
        }

        while (i <= middleHelper) {
            array[k] = helper[i];
            k++;
            i++;
        }
    }

    public void mergeSort(int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(left, middle);
            mergeSort(middle + 1, right);

            merge(left, right);
        }
    }

    private void heap(int[] array, int size, int i) {
        int root = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && array[left] > array[root]) {
            root = left;
        }
        if (right < size && array[right] > array[root]) {
            root = right;
        }

        if (root != i) {
            int aux = array[i];
            array[i] = array[root];
            array[root] = aux;

            heap(array, size, root);
        }
    }

    public void heapSort() {
        int n = size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(array, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int aux = array[0];
            array[0] = array[i];
            array[i] = aux;

            heap(array, i, 0);
        }
    }

    @Override
    public String toString() {
        // String s = "tamanho = " + array.length + "\nocupacao = " + occupation + "\n";
        String s = "\n";
        for (int i = 0; i < array.length; i++) {
            s += (array[i] + " ");
        }
        return s;
    }
}
