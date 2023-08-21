package exam03.config;

import exam03.models.member.*;
import org.springframework.context.annotation.*;

@Configuration
public class AppCtx3 {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberDao memberDao2(){
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }
}