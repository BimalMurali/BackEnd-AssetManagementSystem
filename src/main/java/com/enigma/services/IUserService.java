package com.enigma.services;

import com.enigma.common.APIResponse;

public interface IUserService {
	
	public APIResponse findUserByNameAndPassword(String userName,String password);

}
