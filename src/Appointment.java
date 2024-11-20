public class Appointment {
    private String patientName;
    private String patientPhone;
    private String appointmentTime; // 更改为 appointmentTime
    private HealthProfessional healthProfessional; // 更改为 healthProfessional

    // 默认构造函数
    public Appointment() {
        this.patientName = "";
        this.patientPhone = "";
        this.appointmentTime = ""; // 更改为 appointmentTime
        this.healthProfessional = null; // 更改为 healthProfessional
    }

    // 第二个构造函数，用于初始化所有实例变量
    public Appointment(String patientName, String patientPhone, String appointmentTime, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.appointmentTime = appointmentTime; // 更改为 appointmentTime
        this.healthProfessional = healthProfessional; // 更改为 healthProfessional
    }

    // 打印所有实例变量的方法
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Appointment Time: " + appointmentTime); // 更改为 appointmentTime
        System.out.println("Health Professional: " + (healthProfessional != null ? healthProfessional.getName() : "None")); // 更改为 healthProfessional
    }

    // Getter 和 Setter 方法
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
        return appointmentTime; // 更改为 appointmentTime
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime; // 更改为 appointmentTime
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional; // 更改为 healthProfessional
    }

    public void setHealthProfessional(HealthProfessional healthProfessional) {
        this.healthProfessional = healthProfessional; // 更改为 healthProfessional
    }
}
