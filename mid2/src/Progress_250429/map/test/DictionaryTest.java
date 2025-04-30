package Progress_250429.map.test;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DictionaryTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();

        boolean condA= false;
        boolean condB= false;
        while (!condA && !condB){
            System.out.println("==단어 입력 단계==");
            while (true){
                System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
                String word = reader.readLine();
                if (word.equals("q")){
                    condA = true;
                    break;
                }
                System.out.print("한글 뜻을 입력하세요 : ");
                String meaning = reader.readLine();
                map.put(word,meaning);
            }
            System.out.println("==단어 검색 단계==");
            while (true){
                System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
                String word = reader.readLine();;
                if (word.equals("q")){
                    condB = true;
                    break;
                }
                boolean isFind = false;
                if (map.containsKey(word)) {
                    System.out.println(map.get(word));
                    isFind = true;
                }
                if(!isFind){
                    System.out.println(word + "은(는) 사전에 없는 단어입니다. ");
                }
            }
        }


    }
}