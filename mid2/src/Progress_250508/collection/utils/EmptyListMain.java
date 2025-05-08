package Progress_250508.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

//        빈 불변 리스트
        List<Object> list3 = Collections.emptyList();
        List<Object> list4 = List.of();

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());
    }
}