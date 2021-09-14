package it.softwareinside.management.dentist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.management.dentist.model.Appointment;
import it.softwareinside.management.dentist.service.AppointmentService;
@RestController
@RequestMapping("/api/appointment")
public class RestControllerAppointment {

	@Autowired
	private AppointmentService appointmentService;
	
	/**
	 * uri to get all appointment
	 * @return
	 */
	@GetMapping("/getAll")
	public List<Appointment> getAllAppointments(){
		return appointmentService.getAllAppointments();
	}
	
	/**
	 * uri to get one appointment by ID
	 * @return
	 */
	@GetMapping("/getOneAppointment/{id}")
	public Appointment getOneAppointment(@PathVariable() long id) {
		return appointmentService.getOneAppointment(id);
	}
}
