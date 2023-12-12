package components;

import models.Pool;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import repositories.PoolRepository;
import repositories.UserRepository;

import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PoolRepository poolRepository;

    @Autowired
    UserRepository userRepository;
    public DataLoader(){}

    public void run (ApplicationArguments args){
        User user = new User("Danny", 35, "danny@email.com");
        userRepository.save(user);


        Pool pool = new Pool("G38", 10, 20, ArrayList);
        poolRepository.save(pool);
    }

}
