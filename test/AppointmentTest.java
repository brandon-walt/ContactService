package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import appointment.Appointment;


/**
 * AppointmentTest
 */
public class AppointmentTest {

    @Test 
    public void testAppointmentClass() {
        Date appointmentDate = new Date(System.currentTimeMillis() + 86400000);
        Appointment appointment = new Appointment("001", "Hello World!", appointmentDate);

        assertTrue(appointment.getAppointmentId().equals("001"));
        assertTrue(appointment.getDescription().equals("Hello World!"));
        assertTrue(appointment.getAppointmentDate().equals(appointmentDate));
    }
    // Input Too long Tests
    @Test
    public void testAppointmentClassIdToLong () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("01234567890", "Hello World!", new Date(System.currentTimeMillis() + 86400000));
        });
    }

    @Test
    public void testDescriptionToLong () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("001", "0123456789,0123456789,0123456789,0123456789,0123456789,", new Date(System.currentTimeMillis() + 86400000));
        });
    }


    // Null Input tests
    @Test
    public void testIdIsNull () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, "Hello World!", new Date(System.currentTimeMillis() + 86400000));
        });
    }

    @Test
    public void testDescriptionIsNull () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("001", null, new Date(System.currentTimeMillis() + 86400000));
        });
    }

    @Test
    public void testDateIsNull () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("001", "Hello World!", null);
        });
    }


    // Past Date Input Test
    @Test
    public void testDateIsPast () {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("001", "Hello World!", new Date(System.currentTimeMillis() - 86400000));
        });
    }
}