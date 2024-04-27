package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Date;
import appointment.Appointment;
import appointment.AppointmentService;





public class AppointmentServiceTest {
    private AppointmentService appointmentService;

    @BeforeEach
    public void setUp() {
        appointmentService = new AppointmentService();
    }

    @Test
    void testAddAppointment() {
        Appointment appointment = new Appointment("001", "Hello World!", new Date(System.currentTimeMillis() + 86400000));
        appointmentService.addAppointment(appointment);
        assertEquals(appointment, appointmentService.getAppointment("001"));
    }

    @Test
    void deleteAppointment() {
        Appointment appointment = new Appointment("001", "Hello World", new Date(System.currentTimeMillis() + 86400000));
        appointmentService.addAppointment(appointment);
        appointmentService.deleteAppointment("001");
        assertNull(appointmentService.getAppointment("001"));
    }
}
