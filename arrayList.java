import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // get element--
        int element = list.get(1);
        System.out.println(element);

        // Add element in between
        list.add(1, 5);
        System.out.println(list);

        // set element
        list.set(2, 1);
        list.set(4, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        int element1 = list.size();
        System.out.println(element1);

        // loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
    }
}
