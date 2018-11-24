package com.capg.ui;


import java.util.Scanner;

import com.capg.bean.User;
import com.capg.exception.UserException;
import com.capg.service.UserImp;



public class UI {
	
	static int userId=1000;
	static UserImp service=new UserImp();

	public static void main(String[] args) throws UserException  {
		try {
		
		int age;
		int choice;
		String name,mobilenumber;
		boolean b,condition;
		Scanner sc = new Scanner(System.in);
	    Scanner sc2 = new Scanner(System.in);
	do {
		
		//printing menu
		System.out.println("\nUser Details\n");
	    System.out.println("\nMENU\n");
	    System.out.println("1.AddUser");
	    System.out.println("2.Display user ");
	    System.out.println("3.update details");
	    
	    System.out.println("\nEnter Your Choice");
	    choice = sc.nextInt();
	    condition=true;
	        
	        switch (choice) {

	        case 1:

	        	//getting name input from user
	            
	            do{
	                System.out.println("\nEnter the User Name [with Initial as capital]");
	                name = sc2.nextLine();
	                b=service.validateName(name);
	                if(b==true)
	                {
	                    continue;
	                }
	                else
	                {
	                    System.out.println("\n Name Invalid");
	                }
	                }while(b==false);
	            
	            
	            
	          //getting age input from user
	            
	            do{
	                System.out.println("Enter the  Age [Above 0]");
	                age=sc.nextInt();
	                b=service.validateAge(age);
	                if(b==true)
	                {
	                    continue;
	                }
	                else
	                {
	                    System.out.println("\nAge Invalid");
	                }
	                }while(b==false);
	            
	            
	            
	            
	         
	            
	            
	          //getting phone number input from user
	            do{
	                System.out.println("Enter User Mobile number [10 digits]");
	                mobilenumber = sc.next();
	                b=service.validatemobilenumber(mobilenumber);
	                if(b==true)
	                {
	                    continue;
	                }
	                else
	                {
	                    System.out.println("Phone Number invalid");
	                }
	                }while(b==false);
	            
	            
	         
	            
	            
	            User user=new User();
	            
	            
	            //setting the user input values to the bean class object
	            user.setName(name);
	            user.setAge(age);
	            
	            user.setMobilenumber(mobilenumber);
	            
	            user.setUserid(userId);
	            userId++;
	            
	          Integer c =  service.addUser(user);
                if(c==null){
                	System.out.println("APPOINTMENT REGISTRATION FAILED");
                  }else{
                    System.out.println("APPOINTMENT REGISTERED SUCCESSFULLY,id is" + c);//REGISTRATION DONE
                  
	            
	         

	            break;
                  }
	        
                
                
                
                
                
	        case 2:
	        	System.out.println("enter userid");
				int id = sc.nextInt();
				boolean result=service.validUser(id);
				if(result==true){
				User u=service.displayUser(id);
				System.out.println(u);
				break;
				}
				else{
					
				System.out.println("Invalid id");
				break;
				}

				
	        case 3:
	        	
	        	System.out.println("enter userid");
				int id2 = sc.nextInt();
				boolean result2=service.validUser(id2);
				String mobileNumber=null;
				if(result2==true){
					
		            do{
		                System.out.println("Enter User Mobile number [10 digits]");
						mobileNumber = sc.next();
		                b=service.validatemobilenumber(mobileNumber);
		                if(b==true)
		                {
		                    continue;
		                }
		                else
		                {
		                    System.out.println("Phone Number invalid");
		                }
		                }while(b==false);
					
					
					String update=service.update(id2, mobileNumber);
					System.out.println("updated mobile number is"+update);
					break;
				}
				else{
					System.out.println("Invalid id");
					break;
				}
				

	            
	       default: 
	    	   System.out.println("Wrong Choice");
	    	   break;

	}
	}while(condition);
	sc.close();
	sc2.close();
		}
		//handling exception
		catch(Exception e){
			System.out.println(e);
			throw new UserException();
		}
	
	}
}
