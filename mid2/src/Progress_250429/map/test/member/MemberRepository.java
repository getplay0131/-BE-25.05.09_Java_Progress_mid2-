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
        for (String string : memberMap.keySet()) {
            for (Member value : memberMap.values()) {
                if (value.getId().equals(id)) {
                    return value;
                }
            }
        }
        return null;
    }

    public Member findByName(String name){
        if (name.isEmpty()) {
            System.out.println("입력값이 올바르지 않습니다.");
        }
        for (String string : memberMap.keySet()) {
            for (Member value : memberMap.values()) {
                if (value.getName().equals(name)) {
                    return value;
                }
            }
        }
        return null;
    }
}