package org.tsn.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tsn.tos.UserProfile;

@RequestMapping("service/user/")
@CrossOrigin(origins = "*")
public interface IUserDetailService
{
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String loginUser(UserProfile profile);
}
