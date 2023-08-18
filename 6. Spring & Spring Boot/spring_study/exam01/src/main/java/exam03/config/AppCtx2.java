package exam03.config;

import exam03.models.member.*;
import org.springframework.context.annotation.*;

@Configuration

public class AppCtx2 {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }


}