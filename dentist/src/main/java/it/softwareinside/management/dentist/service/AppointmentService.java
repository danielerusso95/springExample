package it.softwareinside.management.dentist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.management.dentist.model.Appointment;
import it.softwareinside.management.dentist.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	/**
	 * return full list of appointment
	 * @return
	 */
	public List<Appointment> getAllAppointments() {
		return appointmentRepository.findAll();
	}
	
	/**
	 * return one appointment by ID
	 * @return
	 */
	public Appointment getOneAppointment(long id) {
		return appointmentRepository.getById(id);
	}
}
