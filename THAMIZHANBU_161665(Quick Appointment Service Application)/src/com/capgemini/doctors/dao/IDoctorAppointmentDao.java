package com.capgemini.doctors.dao;

import com.capgemini.doctors.bean.DoctorAppointment;

public interface IDoctorAppointmentDao {

	int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment);
	DoctorAppointment getAppointmentDetails(int appointmentId);
}
