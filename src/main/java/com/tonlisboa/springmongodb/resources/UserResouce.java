package com.tonlisboa.springmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tonlisboa.springmongodb.domain.User;
import com.tonlisboa.springmongodb.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResouce {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
