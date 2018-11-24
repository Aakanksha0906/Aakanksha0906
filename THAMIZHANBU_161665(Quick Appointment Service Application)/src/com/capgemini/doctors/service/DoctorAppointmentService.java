package com.capgemini.doctors.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;
import com.capgemini.doctors.exception.DoctorAppointmentException;

public class DoctorAppointmentService implements IDoctorAppointmentService {
	
	DoctorAppointmentDao dao=new DoctorAppointmentDao();
	DoctorAppointment dabean=new DoctorAppointment();
	
	//name validation
	 public boolean validateName(String name2) throws DoctorAppointmentException
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
	    public boolean validateAge(int age) throws DoctorAppointmentException
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
	    
	    
	    
	  //gender validation
	    public boolean validateGender(String gender) throws DoctorAppointmentException
	    {
	    boolean flag=false;
	    String g1="Male",g2="Female";
	    if(g1.equalsIgnoreCase(gender))
	    {
	        flag=true;
	    }
	    else if(g2.equalsIgnoreCase(gender))
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
	    public boolean validatePhoneNumber(String phoneNumber) throws DoctorAppointmentException
	    {
	    boolean flag=false;
	    Pattern number=Pattern.compile("[0-9]{10}");
	    Matcher numMatch=number.matcher(phoneNumber);
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
	    
	    
	  //email validation
	    public boolean validateEmail(String email) throws DoctorAppointmentException
	    {
	    boolean flag=false;

	    if(email.endsWith(".com"))
	    {
	        flag=true;
	    }
	    else
	    {
	        flag=false;
	    }
	    return flag;
	    }
	    
	    
	  //problem validation
	    
		 public boolean validateProblem(String problem) throws DoctorAppointmentException
		    {
		    boolean flag=false;
		    Pattern problemName=Pattern.compile("[A-za-z,\\s]+");
		    Matcher problemNameMatch=problemName.matcher(problem);
		    if(problemNameMatch.matches())
		    {
		        flag=true;
		    }
		    else
		    {
		        flag=false;
		    }
		    return flag;
		    }

		 
		//setting appointment status
	    public String appointmentStatus(String problem) throws DoctorAppointmentException
	    {
	    String pblm1="Heart",pblm2="Gynecology",pblm3="Diabetes",pblm4="ENT",pblm5="Bone",pblm6="Dermatology";
	    String flag="DISAPPROVED";
	    if(pblm1.equalsIgnoreCase(problem)||pblm2.equalsIgnoreCase(problem)||pblm3.equalsIgnoreCase(problem)||
	    		pblm4.equalsIgnoreCase(problem)||pblm5.equalsIgnoreCase(problem)||pblm6.equalsIgnoreCase(problem))
	    {
	    	flag="APPROVED\n\nAPPOINTMENT DATE AND TIME, ALONG WITH DOCTOR'S PHONE NUMBER WILL BE SHARED SHORTLY";
	    }	
	    return flag;
	    }

	    
	    
	    //assigning the doctor
	    public String doctorName(String problem) throws DoctorAppointmentException
	    {
	    String flag=null;
	    String pblm1="Heart",pblm2="Gynecology",pblm3="Diabetes",pblm4="ENT",pblm5="Bone",pblm6="Dermatology"; 
	    if(pblm1.equalsIgnoreCase(problem))
	    {
	    	
	    	flag="Dr. Brijiesh Kumar";
	    }
	    
	    else if (pblm2.equalsIgnoreCase(problem))
	    {
	    	flag="Dr. Sharda Singh";
	    }
	    
	    else if(pblm3.equalsIgnoreCase(problem))
	    {
	    	flag="Dr. Heena Khan";
	    }
	    else if(pblm4.equalsIgnoreCase(problem))
	    {
	    	flag="Dr. Paras mal";
	    }
	    else if(pblm5.equalsIgnoreCase(problem))
	    {
	    	flag="Dr. Renuka Kher";
	    }
	    else if(pblm6.equalsIgnoreCase(problem))
	    {
	    	flag="Dr.Kanika Kapoor";
	    }	
	    return flag;
	    }
	
	//adding patient appointment
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) {
		
		return dao.addDoctorAppointmentDetails(doctorAppointment);
	}
	
	//returning appointment details
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId){
		
		
		return dao.getAppointmentDetails(appointmentId);
	}
	

}
