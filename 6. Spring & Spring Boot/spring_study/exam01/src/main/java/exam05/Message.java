package exam05;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {
    public void send(String message){
        System.out.printf("보낸 메세지: %s%n", message);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet!!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy!!"); // 소멸 단계 전
    }
}
