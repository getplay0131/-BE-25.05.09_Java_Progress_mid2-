package Exam_250314;

public class 문자열계산하기 {
    public int solution(String my_string) {
        int answer = 0;
        if (my_string.contains("+")) {
            String[] split = my_string.replace(" + ", "+").split("\\+");
            for (String string : split) {
                answer += Integer.parseInt(string);
            }
        } else if (my_string.contains("-")) {
            String[] split = my_string.replace(" - ", "-").split("\\-");
            for (String string : split) {
                answer -= Integer.parseInt(string);
            }
        }
        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        String my_string = "3 - 4";
        int answer = 0;
        int count = 0;
        if (my_string.contains("+")) {
            my_string.replace(" + ", "+");
        } else if (my_string.contains("-")) {
            my_string.replace(" - ", "-");
        }


        System.out.println(answer);
    }
}