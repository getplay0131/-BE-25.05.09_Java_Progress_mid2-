package Progress_250508.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list Class = " + list.getClass());
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList Class = " + synchronizedList.getClass());

        System.out.println(list);
        System.out.println(synchronizedList);
        list.add(4);
        System.out.println(list);
        System.out.println(synchronizedList);
    }
}