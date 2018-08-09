package com.shalom.onlinetest.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.shalom.onlinetest.dto.UserDTO;
import com.shalom.onlinetest.entity.User;
import com.shalom.onlinetest.entity.VerificationToken;

@Service
public interface IUserService extends UserDetailsService {
	public User registerUser(UserDTO userDto);

	public User findByUsername(String username);

	public User loginUser(UserDTO userDTO);

	public User findByUsernameAndPassword(String username, String password);

	public void createVerificationToken(User user, String token);

	public VerificationToken getVerificationToken(String verificationToken);
}
