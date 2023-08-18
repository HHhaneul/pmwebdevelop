package exam02.models.member;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceManager {

    private static ServiceManager instance;

    public static ServiceManager getInstance(){
        if (instance == null){
            instance = new ServiceManager();
        }
        return instance;
    }

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private JoinValidator validator;

    public JoinService joinService(){
        return new JoinService();
    };


    public ListService listService(){
        return new ListService();
    }

}
