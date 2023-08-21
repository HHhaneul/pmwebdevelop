package exam05.config;

import exam05.*;
import org.springframework.context.annotation.*;

@Configuration
public class AppCtx {

    @Bean
    public Message message(){
        return new Message();
    }

    @Scope("prototype") // 주소값 다름 다른 객체
    @Bean(initMethod = "init", destroyMethod = "close")
    public Message2 message2(){
        return  new Message2();
    }
}
