package Progress_250508.collection.compare;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

      MyUser[] array =   {myUser1,myUser2,myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparable 기본 정렬");
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator 정렬");
        Arrays.sort(array,new IdComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(array,new IdComparator().reversed());
        System.out.println(Arrays.toString(array));

    }
}