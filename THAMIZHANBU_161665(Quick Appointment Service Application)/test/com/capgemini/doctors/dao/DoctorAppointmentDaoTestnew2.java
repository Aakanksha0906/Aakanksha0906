package com.capgemini.doctors.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.DoctorAppointmentException;
import com.capgemini.doctors.service.DoctorAppointmentService;

public class DoctorAppointmentDaoTestnew2 {

	static DoctorAppointmentService daservice=new DoctorAppointmentService();
	static DoctorAppointment dabean=new DoctorAppointment();
	static DoctorAppointmentDao dao=new DoctorAppointmentDao();
	@Test
	public void testAddDoctorAppointmentDetails() throws DoctorAppointmentException {
		
		
		 dabean.setPatientName("name");
         dabean.setAge(23);
         dabean.setGender("male");
         dabean.setPhoneNumber("9874561531");
         dabean.setEmail("abc@mail.com");
         dabean.setProblemName("Heart");
         String appointmentStatus = daservice.appointmentStatus("Heart");
         String doctorName = daservice.doctorName("Heart");
         
         dabean.setAppointmentStatus(appointmentStatus);
         dabean.setDoctorName(doctorName);
         dabean.setAppointmentId(1005);
         
         int id=dao.addDoctorAppointmentDetails(dabean);
         
         
         assertEquals(1005, id);
		
	}

	@Test
	public void testGetAppointmentDetails() {
		
		
		DoctorAppointment dabean2=dao.getAppointmentDetails(1005);
		String docName=dabean2.getDoctorName();
		assertEquals("Dr. Brijiesh Kumar",docName);
		
		
		
	}

}
