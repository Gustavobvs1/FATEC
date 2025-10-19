public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();
        list.pushInit(12);
        list.pushInit(13);

        System.out.println(list);
        list.push(1, 5);
        System.out.println(list);
    }
}
