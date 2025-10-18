public class TestMyArray {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(20000);

        myArray.fillArray();
        myArray.quickSort(0, myArray.size() - 1);
        System.out.println("Array de tamanho: " + myArray.size() + "\n");
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            MyArray cloneArray = myArray.clone();
            long init = System.nanoTime();
            cloneArray.bubbleSort();
            long end = System.nanoTime();
            System.out.println("BubbleSort " + (i + 1) + ": " + (end - init));
            sum += (end - init);
        }
        System.out.println(sum / 15 + "\n");

        int sum2 = 0;
        for (int i = 0; i < 15; i++) {
            MyArray cloneArray = myArray.clone();
            long init = System.nanoTime();
            cloneArray.selectionSort();
            long end = System.nanoTime();
            System.out.println("SelectionSort " + (i + 1) + ": " + (end - init));

            sum2 += (end - init);
        }
        System.out.println(sum2 / 15 + "\n");

        int sum3 = 0;
        for (int i = 0; i < 15; i++) {
            MyArray cloneArray = myArray.clone();
            long init = System.nanoTime();
            cloneArray.insertionSort();
            long end = System.nanoTime();
            System.out.println("InsertionSort " + (i + 1) + ": " + (end - init));
            sum3 += (end - init);
        }
        System.out.println(sum3 / 15 + "\n");

        int sum4 = 0;
        for (int i = 0; i < 15; i++) {
            MyArray cloneArray = myArray.clone();
            long init = System.nanoTime();
            cloneArray.quickSort(0, myArray.size() - 1);
            long end = System.nanoTime();
            System.out.println("QuickSort " + (i + 1) + ": " + (end - init));
            sum4 += (end - init);
        }
        System.out.println(sum4 / 15 + "\n");

        int sum5 = 0;
        for (int i = 0; i < 15; i++) {
            MyArray cloneArray = myArray.clone();
            long init = System.nanoTime();
            cloneArray.mergeSort(0, myArray.size() - 1);
            long end = System.nanoTime();
            System.out.println("MergeSort " + (i + 1) + ": " + (end - init));
            sum5 += (end - init);
        }
        System.out.println(sum5 / 15 + "\n");
    }
}
