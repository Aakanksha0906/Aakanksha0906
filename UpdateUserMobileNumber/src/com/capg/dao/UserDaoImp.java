package com.capg.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capg.bean.User;


public class UserDaoImp {
	
	
	 Scanner sc=new Scanner(System.in);
	    Map <Integer,User> m=new HashMap<Integer,User>();
	    User user=new User();

	 
	    public Integer addUser(User user)  {
	        // TODO Auto-generated method stub
	    	
	         m.put(user.getUserid(), user);
	         return user.getUserid();
	        }
	    
	    
	    
	    
	    
	       public Boolean validUser(int userid) {
	   		Boolean us=false;
	   		
	   	
	   		for(User user:m.values())
	   		{
	   			if(user.getUserid()==userid)
	   				us=true;
	   		}
	   			
	   			return us;
	   		}
	   		

	
	       
	       
	        
       public User displayUser(int userid) {
		User us=null;
		
	
		for(User user:m.values())
		{
			if(user.getUserid()==userid)
				us=user;
		}
			
			return us;
		}
		
		
			
			
			public String update(int userid, String mobilenumber) {
				User us=null;
				for(User user:m.values())
				{
				if(user.getUserid()==userid)
				{
					user.setMobilenumber(mobilenumber);
					us=user;
					
				}
				
			
			
			
		}
				return us.getMobilenumber();


}
}
