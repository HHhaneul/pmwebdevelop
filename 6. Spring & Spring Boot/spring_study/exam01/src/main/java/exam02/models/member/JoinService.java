package exam02.models.member;

import org.springframework.stereotype.Service;

@Service
public class JoinService {
    public MemberDao memberDao(){
        return new MemberDao();
    }

    public JoinValidator validator(){
        return new JoinValidator();
    }

    public void join(Member member){
        validator().check(member);
        memberDao().register(member);
    }
}
