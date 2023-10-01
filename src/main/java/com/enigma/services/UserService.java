package com.enigma.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.common.APIResponse;
import com.enigma.entity.User;
import com.enigma.repository.IUserRepository;
import com.enigma.util.JwtUtil;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository userRepo;
	@Autowired
	private APIResponse apiresponse;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	
	@Override
	public APIResponse findUserByNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		//verify user exists
		User user=userRepo.findUserByNameAndPassword(userName, password);
		if(user==null) {
			apiresponse.setData("INVALID CREDENTIALS!!");
			return apiresponse;
		}
		
		//credentials are correct
			String token = jwtUtil.generateJwt(user);
			
		//storing more details and token
			Map<String,Object>data=new HashMap<String,Object>();
			data.put("ACCESSTOKEN",token);
			data.put("role",user.getRoleId());
			data.put("Username",user.getUserName());
			
			apiresponse.setStatus(200);
			apiresponse.setData(data);
			
			return apiresponse;

}
}
