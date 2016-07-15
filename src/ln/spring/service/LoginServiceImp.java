package ln.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ln.spring.bean.User;
import ln.spring.dao.LoginDao;

@Service
public class LoginServiceImp  implements LoginService{
	@Autowired 
	private LoginDao loginDao;
	
	public User validateUser(User user)
	{
		System.out.println(user.getUsername());
		return loginDao.validateUser(user);
	}
}
