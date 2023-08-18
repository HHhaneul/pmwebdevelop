package exam02.main;

import exam02.models.member.*;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        JoinService joinService = ServiceManager.getInstance().joinService();

        ListService listService = ServiceManager.getInstance().listService();

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("12345678");
        member.setUserNm("이이름");
        member.setRegDt(LocalDateTime.now());

        joinService.join(member);

        listService.print();


    }
}
