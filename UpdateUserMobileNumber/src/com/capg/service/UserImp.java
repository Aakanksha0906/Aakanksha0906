package com.capg.service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capg.bean.User;
import com.capg.dao.UserDaoImp;



public class UserImp implements UserService {
	
	UserDaoImp dao=new UserDaoImp();
	User user=new User();
	
	//name validation
	 public boolean validateName(String name2) 
	    {
	    boolean flag=false;
	    Pattern name=Pattern.compile("^[A-Z][A-za-z,\\s]+");
	    Matcher nameMatch=name.matcher(name2);
	    if(nameMatch.matches())
	    {
	        flag=true;
	    }
	    else
	    {
	        flag=false;
	    }
	    return flag;
	    }
	    
	    
	//age validation
	    public boolean validateAge(int age) 
	    {
	    boolean flag=false;
	    if(age>0)
	    {
	        flag=true;
	    }
	    else
	    {
	        flag=false;
	    }
	    return flag;
	    }
	    
	    
	    
	  
	    
	    
	    
	  //phone number validation
	    public boolean validatemobilenumber(String mobilenumber) 
	    {
	    boolean flag=false;
	    Pattern number=Pattern.compile("[0-9]{10}");
	    Matcher numMatch=number.matcher(mobilenumber);
	    if(numMatch.matches())
	    {
	        flag=true;
	    }
	    else
	    {
	        flag=false;
	    }
	    return flag;
	    }
	    
	    
	 
	 
		

	    
	    


	public Integer addUser(User user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	
	@Override
	public User displayUser(int userid) {
		
		return dao.displayUser(userid);
	}
	

	public Object getUsertDetails(int appointId) {
		// TODO Auto-generated method stub
		return null;
	}


	public String update(int userid, String mobilenumber) {
		// TODO Auto-generated method stub
		
		return dao.update(userid, mobilenumber);
	}


	public boolean validUser(int id) {
		// TODO Auto-generated method stub
		return dao.validUser(id);
	}
	

}
