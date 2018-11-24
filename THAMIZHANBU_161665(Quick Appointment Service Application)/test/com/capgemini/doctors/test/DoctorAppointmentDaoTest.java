package com.capgemini.doctors.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;

class DoctorAppointmentDaoTest {
	DoctorAppointmentDao dao=null;
	DoctorAppointment dabean=null;
	int result;

	@Test
	void testAddDoctorAppointmentDetails() {
		dao=new DoctorAppointmentDao();
		dabean=new DoctorAppointment();
		dabean.setAppointmentId(100);
		dabean.setAppointmentStatus("Approved");
		result=dao.addDoctorAppointmentDetails(dabean);
		assertEquals(100, result, "Working correctly");
		
	}

	@Test
	void testGetAppointmentDetails() {
		dao=new DoctorAppointmentDao();
		dabean=new DoctorAppointment();
		DoctorAppointment dabean2=null;
		DoctorAppointment dabean3=null;
		dabean.setAppointmentId(100);
		dabean.setAppointmentStatus("Approved");
		dabean2=dao.getAppointmentDetails(100);
		dabean3=dao.getAppointmentDetails(101);
		assertEquals(dabean2, dabean3);

	}

}
