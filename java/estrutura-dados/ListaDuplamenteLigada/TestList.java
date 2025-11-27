public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();
        list.pushInit(12);
        list.pushInit(13);
        list.pushInit(11);
        list.pushInit(10);
        list.pushInit(133);
        list.pushInit(120);
        list.pushInit(104);

        System.out.println(list);
        list.invert();
        System.out.println(list);
    }
}
