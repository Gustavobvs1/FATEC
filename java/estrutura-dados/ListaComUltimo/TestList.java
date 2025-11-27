public class TestList {

    public static void main(String[] args) {

        List list = new List();

        list.pushEnd(4);
        list.pushEnd(5);
        list.pushEnd(2);
        list.pushEnd(9);

        System.out.println(list);

        list.insertAt(3, 2);
        System.out.println(list);
    }
}
