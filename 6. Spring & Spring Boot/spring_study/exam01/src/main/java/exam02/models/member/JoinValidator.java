package exam02.models.member;

public class JoinValidator {

    public void check(Member member){
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String userNm = member.getUserNm();


        nullBlank(userId, "아이디를 입력하세요.");

        nullBlank(userPw, "비밀번호를 입력하세요.");

        nullBlank(userNm, "회원명을 입력하세요.");

        /*
        if (userPw == null || userPw.isBlank()){
            throw new JoinValidationException("비밀번호를 입력하세요.");
        }

        if (userNm == null || userNm.isBlank()){
            throw new JoinValidationException("회원명을 입력하세요.");
        }
        */

    }

    public static void nullBlank(String a, String message){
        if (a == null || a.isBlank()){
            throw new JoinValidationException(message);
        }
    }
}
