public class Appointment {
    private String patientName;// 设置变量
    private String patientPhone;
    private String appointmentTime; 
    private HealthProfessional healthProfessional; 

    // 构造函数
    public Appointment() {
        this.patientName = "";
        this.patientPhone = "";
        this.appointmentTime = ""; 
        this.healthProfessional = null;
    }

    // 初始化变量，构造第二函数
    public Appointment(String patientName, String patientPhone, String appointmentTime, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.appointmentTime = appointmentTime; 
        this.healthProfessional = healthProfessional; 
    }

    // 打印变量
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Appointment Time: " + appointmentTime); 
        System.out.println("Health Professional: " + (healthProfessional != null ? healthProfessional.getName() : "None"));
    }

    // 使用getter和setter来设置和获取变量
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
