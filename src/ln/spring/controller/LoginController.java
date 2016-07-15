package ln.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import ln.spring.bean.User;
import ln.spring.service.LoginService;

@RestController
public class LoginController {


	@Autowired
	private LoginService loginservice;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody User validateUser(@RequestBody User user)
	{
		System.out.println(user.getUsername());
		User u=loginservice.validateUser(user);
		return u;
		
	}
	
}
