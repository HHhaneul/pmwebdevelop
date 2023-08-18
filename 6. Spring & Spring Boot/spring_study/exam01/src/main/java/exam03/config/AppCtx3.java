package exam03.config;

import exam03.models.member.*;
import org.springframework.context.annotation.*;

@Configuration
@Import(value = AppCtx2.class)
public class AppCtx3 {

    @Bean
    public JoinService joinService(){
        return new JoinService();
    }

    @Bean
    public ListService listService() {
        return new ListService();
    }
}
