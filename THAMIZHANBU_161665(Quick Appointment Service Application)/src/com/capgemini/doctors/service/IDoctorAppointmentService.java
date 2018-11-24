package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.DoctorAppointmentException;

public interface IDoctorAppointmentService {
	
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment)throws DoctorAppointmentException;
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId)throws DoctorAppointmentException;

}
