package exam03.models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class ListService {

    private MemberDao memberDao;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy.MM.dd");

    @Autowired(required = false)
//    @Autowired
    public void setFormatter(DateTimeFormatter formatter){
        this.formatter = formatter;
    }


    @Autowired
    @Qualifier("memberDao2")
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void print() {
        List<Member> members = memberDao.getList();
        members.stream().map(this::toConvert).forEach(System.out::println);
    }

    private Member toConvert(Member member){
        member.setRegDtStr(formatter.format(member.getRegDt()));
        return member;
    }
}