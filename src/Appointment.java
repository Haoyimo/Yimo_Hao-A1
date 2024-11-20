public class Appointment {
    private String patientName;//Set variables
    private String patientPhone;
    private String appointmentTime; 
    private HealthProfessional healthProfessional; 

    //Constructor function
    public Appointment() {
        this.patientName = "";
        this.patientPhone = "";
        this.appointmentTime = ""; 
        this.healthProfessional = null;
    }

    //Initialize variables and construct a second function
    public Appointment(String patientName, String patientPhone, String appointmentTime, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.appointmentTime = appointmentTime; 
        this.healthProfessional = healthProfessional; 
    }

    //Print variables
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Appointment Time: " + appointmentTime); 
        System.out.println("Health Professional: " + (healthProfessional != null ? healthProfessional.getName() : "None"));
    }

    //Using Getters and Setters to Set and Retrieve Variables
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getAppointmentTime() {
        return appointmentTime; 
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime; 
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional; 
    }

    public void setHealthProfessional(HealthProfessional healthProfessional) {
        this.healthProfessional = healthProfessional; 
    }
}
