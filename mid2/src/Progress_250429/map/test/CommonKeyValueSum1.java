package Progress_250429.map.test;

import java.util.HashMap;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B",4);
        map2.put("C",5);
        map2.put("D",6);

        HashMap<String, Integer> resultMap = new HashMap<>();
//        for (String m1 : map1.keySet()) {
//            for (String m2 : map2.keySet()) {
//                if (m1.equals(m2)) {
//                    resultMap.put(m1,(map1.get(m1) +map2.get(m2) ));
//                }
//            }
//        }
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                Integer map1Value = map1.get(key);
                Integer map2Value = map2.get(key);
                resultMap.put(key, (map1Value+map2Value));
            }
        }


        System.out.println(resultMap);
    }
}