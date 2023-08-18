package exam02.models.member;

import lombok.*;

import java.time.LocalDateTime;

@Data
public class Member {
    private String userId;
    private String userPw;
    private String userNm;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
