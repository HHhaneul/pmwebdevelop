package exam02.models.member;

import java.util.*;

public class ListService {

    public MemberDao memberDao(){
        return new MemberDao();
    }

    public void print(){
        List<Member> members = memberDao().getList();
        members.stream().forEach(System.out::println);
    }
}
