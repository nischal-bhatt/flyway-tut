package com.example.demoporject;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoporject.model.User;

@RestController
public class ControllerClassNish {

	@Autowired
	public UserRepository ur;
	
	@GetMapping("/users")
	public User getUsers(@RequestParam int id)
	{
             Optional<User> users = this.ur.findById(id);
             User u = new User();
             u.setEmail("heu");
             u.setFirst_name("fuc u!");
             u.setPets("gezjk");
             return users.orElseGet(() -> u);
	}
}
