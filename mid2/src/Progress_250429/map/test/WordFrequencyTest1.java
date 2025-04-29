package Progress_250429.map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";

        String[] split = text.split(" ");

        HashMap<String, Integer> resultMap = new HashMap<>();
        for (String splits : split) {
            Integer count = resultMap.get(splits);
            if (count == null) {
                count = 0;
            }
            count++;
                    resultMap.put(splits,count);
        }

        System.out.println(resultMap);
    }
}