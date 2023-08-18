package exam03.models.member;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
public class JoinService {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private JoinValidator validator;

    public JoinService(MemberDao memberDao, JoinValidator validator) {
        this.memberDao = memberDao;
        this.validator = validator;
    }

    public void join(Member member) {

        validator.check(member);

        memberDao.register(member);
    }

}