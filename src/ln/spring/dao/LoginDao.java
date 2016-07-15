package ln.spring.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import ln.spring.bean.User;
@Configuration
@Repository
public interface LoginDao {

	public User validateUser(User user);

}
