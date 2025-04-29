package Progress_250429.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
    String[][] productArr = {{"Java","10000"},{"Spring","20000"},{"JPA","30000"}};

//    배열로부터 맵 생성
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] strings : productArr) {
            map.put(strings[0], Integer.parseInt(strings[1]));
        }

        System.out.println(map);
//        map의 모든 데이터 출력
        for (String string : map.keySet()) {
            System.out.println("제품 : " + string + ", 가격 : " + map.get(string));
        }
    }
}