package exam03.models.member;

public class JoinValidator {

    public void check(Member member){
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String userNm = member.getUserNm();

        nullBlank(userId, "아이디를 입력하세요.");

        nullBlank(userPw, "비밀번호를 입력하세요.");

        nullBlank(userNm, "회원명을 입력하세요.");
    }
    public static void nullBlank(String userInfo, String message){
        if (userInfo == null || userInfo.isBlank()){
            throw new JoinValidationException(message);
        }
    }
}
