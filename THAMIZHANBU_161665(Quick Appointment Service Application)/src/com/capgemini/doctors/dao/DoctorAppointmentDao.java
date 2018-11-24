package com.capgemini.doctors.dao;

import java.util.HashMap;
import java.util.Map;
import com.capgemini.doctors.bean.DoctorAppointment;

public class DoctorAppointmentDao implements IDoctorAppointmentDao{
	
	static Map<Integer, DoctorAppointment> map = new HashMap<Integer, DoctorAppointment>();

	
	//adding patient appointment
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) {
		
		map.put(doctorAppointment.getAppointmentId(),doctorAppointment);
		return doctorAppointment.getAppointmentId();
	}
	
	
	//returning appointment details
	public DoctorAppointment getAppointmentDetails(int appointmentId){
		DoctorAppointment details=null;
        for (DoctorAppointment da : map.values()) {
            if (da.getAppointmentId()==appointmentId) {
                details=da;
            }
	}
        return details;
}
}
