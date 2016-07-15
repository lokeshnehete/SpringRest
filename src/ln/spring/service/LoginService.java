package ln.spring.service;

import org.springframework.stereotype.Service;

import ln.spring.bean.User;
@Service
public interface LoginService {
	public User validateUser(User user);
}
