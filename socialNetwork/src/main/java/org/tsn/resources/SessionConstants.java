package org.tsn.resources;

public class SessionConstants {

	public static final String	USER_PROFILE	= "userprofile";
	
	// EL Constants, Static constants can not be accessed in jsp , thus we create following EL variables 
	public String USER_PROFILE_EL  = USER_PROFILE;
	
	public String getUSER_PROFILE()
	{return USER_PROFILE;}
 

}
