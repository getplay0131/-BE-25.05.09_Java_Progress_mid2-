package Progress_250429.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String,Member> memberMap = new HashMap<>();

    public void save(Member member){
        if (member == null) {
            System.out.println("입력값이 올바르지 않습니다.");
            return;
        }
        memberMap.put(member.getId(), member);
    }

    public void remove(String id){
        if (id.isEmpty()) {
            System.out.println("입력값이 올바르지 않습니다.");
        }

        memberMap.remove(id);
    }

    public Member findById(String id){
        if (id.isEmpty()) {
            System.out.println("입력값이 올바르지 않습니다.");
        }
//        for (Map.Entry<String, Member> entry : memberMap.entrySet()) {
//            if (entry.getKey().equals(id)) {
//                return entry.getValue();
//            }
//        }
        if (memberMap.containsKey(id)) {
           return memberMap.get(id);
        }
        return null;
    }

    public Member findByName(String name){
        if (name.isEmpty()) {
            System.out.println("입력값이 올바르지 않습니다.");
        }
        for (Map.Entry<String, Member> entry : memberMap.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getValue();
            }
        }
        return null;
    }
}