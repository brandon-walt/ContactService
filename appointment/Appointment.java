package appointment;

import java.util.Date;

public class Appointment {
    // Private fields
    private String appointmentId;
    private String description;
    private Date appointmentDate;
   
    // Constructor
    public Appointment(String appointmentId, String description, Date appointmentDate) {
        validateId(appointmentId);
        validateDescription(description);
        validateDate(appointmentDate);
        this.appointmentId = appointmentId;
        this.description = description;
        this.appointmentDate = appointmentDate;
    }
    
    // Getters
    public String getAppointmentId() {
        return appointmentId;
    }

    public String getDescription() {
        return description;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    } 

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }


    // Validators 
    private void validateId(String appointmentId) {
        if (appointmentId == null || appointmentId.length() > 10) {
            throw new IllegalArgumentException("Ivalid Id");
        }
    }

    public void validateDescription(String description) {
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid Description");
        }
    }

    
    public void validateDate(Date appointmentDate) {
        if (appointmentDate == null || appointmentDate.before(new Date())) {
            throw new IllegalArgumentException("Invalid Date");
        }
    }
}
