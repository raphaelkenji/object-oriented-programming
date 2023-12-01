package ArrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("40");
        list.add("69");
        System.out.println(list);
        Main a = new Main();
        a.check(list);
        list.remove("B");
        a.check(list);
        System.out.println(list.size());

    }

    public void check (ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
