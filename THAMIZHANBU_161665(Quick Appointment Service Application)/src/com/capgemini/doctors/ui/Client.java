package com.capgemini.doctors.ui;


import java.util.Scanner;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.DoctorAppointmentException;
import com.capgemini.doctors.service.DoctorAppointmentService;

public class Client {
	
	static int appointmentId=1000;
	static DoctorAppointmentService daservice=new DoctorAppointmentService();

	public static void main(String[] args) throws DoctorAppointmentException {
		try {
		
		int age, choice,appointId;
		String PatientName, phoneNumber,  email, gender, problemName, doctorName, appointmentStatus,appointmentDate;
		boolean b,condition;
		Scanner sc = new Scanner(System.in);
	    Scanner sc2 = new Scanner(System.in);
	do {
		
		//printing menu
		System.out.println("\nQUICK APPOINTMENT SERVICE APPLICATION\n");
	    System.out.println("\nMENU\n");
	    System.out.println("1.Book Appointment Details");
	    System.out.println("2.View Doctor Appointment");
	    System.out.println("3.Exit");
	    
	    System.out.println("\nEnter Your Choice");
	    choice = sc.nextInt();
	    condition=true;
	        
	        switch (choice) {

	        case 1:

	        	//getting name input from user
	            
	            do{
	                System.out.println("\nEnter the Patient Name [with Initial as capital]");
	                PatientName = sc2.nextLine();
	                b=daservice.validateName(PatientName);
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
	                System.out.println("Enter the Patient Age [Above 0]");
	                age=sc.nextInt();
	                b=daservice.validateAge(age);
	                if(b==true)
	                {
	                    continue;
	                }
	                else
	                {
	                    System.out.println("\nAge Invalid");
	                }
	                }while(b==false);
	            
	            
	            
	            
	          //getting gender input from user
	            do{
	                System.out.println("Enter the patient's Gender [eg. Male or Female]");
	                gender = sc.next();
	                b=daservice.validateGender(gender);
	                if(b==true)
	                {
	                    continue;
	                }
	                else
	                {
	                    System.out.println("\nGender Invalid");
	                }
	                }while(b==false);
	            
	            
	            
	          //getting phone number input from user
	            do{
	                System.out.println("Enter Patient Phone number [10 digits]");
	                phoneNumber = sc.next();
	                b=daservice.validatePhoneNumber(phoneNumber);
	                if(b==true)
	                {
	                    continue;
	                }
	                else
	                {
	                    System.out.println("Phone Number invalid");
	                }
	                }while(b==false);
	            
	            
	          //getting mail id input from user
	            do{
	                System.out.println("Enter Patient e-mail Id");
	                email=sc.next();
	                b=daservice.validateEmail(email);
	                if(b==true)
	                {
	                    continue;
	                }
	                else
	                {
	                    System.out.println("\nInvalid e-mail Id");
	                }
	                }while(b==false);
	            
	            
	          //getting patient problem input from user
	            do{
	                System.out.println("Enter Patient Problem ");
	                problemName=sc.next();
	                b=daservice.validateProblem(problemName);
	                if(b==true)
	                {
	                    continue;
	                }
	                else
	                {
	                    System.out.println("\naadhaar invalid");
	                }
	                }while(b==false);
	            
	            appointmentStatus=daservice.appointmentStatus(problemName);
	            doctorName=daservice.doctorName(problemName);
	            appointmentDate="2nd November,2018";
	            
	            
	            DoctorAppointment dabean=new DoctorAppointment();
	            
	            
	            //setting the user input values to the bean class object
	            dabean.setPatientName(PatientName);
	            dabean.setAge(age);
	            dabean.setGender(gender);
	            dabean.setPhoneNumber(phoneNumber);
	            dabean.setEmail(email);
	            dabean.setProblemName(problemName);
	            dabean.setAppointmentStatus(appointmentStatus);
	            dabean.setDoctorName(doctorName);
	            dabean.setAppointmentDate(appointmentDate);
	            dabean.setAppointmentId(appointmentId);

	            
	          //for adding doctor appointment
	            int result=daservice.addDoctorAppointmentDetails(dabean);
	            if(result>0)
	            {
	            	System.out.println("YOUR DOCTOR APPOINTMENT HAS BEEN SUCCESSFULLY REGISTERED, YOUR APPOINMENT ID IS "+result);
	            }
	            else
	            {
	            	System.out.println("APPOINTMENT IS NOT REGISTERED");
	            }
	            appointmentId++;

	            break;
	        case 2:
	            
	        	//for printing appointment status
	            System.out.println("Enter Appoinment Id");
	            appointId=sc.nextInt();
	            System.out.println("\nDOCTOR APPOINTMENT STATUS\n");
	            System.out.println(daservice. getDoctorAppointmentDetails(appointId).toStrings());
	            break;
	        
	        case 3:
	        	condition=false;
	        	continue;
	            
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
			throw new DoctorAppointmentException("Exception Occurs");
		}
	
	}
}
