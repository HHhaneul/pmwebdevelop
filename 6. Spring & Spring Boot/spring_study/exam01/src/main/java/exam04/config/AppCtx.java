package exam04.config;

import exam04.models.member.MemberDao;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(basePackages = "exam04.models", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class))
//@ComponentScan(basePackages = "exam04.models", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class))
//@ComponentScan(basePackages = "exam04.models")
@ComponentScan(basePackages = "exam04.models", excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "exam04.models..*Dao"))
public class AppCtx {
    /*
    @Bean
    public MemberDao memberDao(){
        System.out.println("수동 빈 등록");
        return new MemberDao();
    }
     */
}