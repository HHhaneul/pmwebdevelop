package exam03.main;

import exam03.config.*;
import exam03.models.member.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;


public class Ex02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

//        JoinService joinService = ctx.getBean("joinService", JoinService.class);
//        ListService listService = ctx.getBean("listService", ListService.class);
        JoinService joinService = ctx.getBean(JoinService.class);
        ListService listService = ctx.getBean(ListService.class);


        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("12345678");
        member.setUserNm("이이름");
        member.setRegDt(LocalDateTime.now());

        joinService.join(member);
        listService.print();

        ctx.close();

    }
}
