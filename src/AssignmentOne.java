import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // 第3部分：使用类和对象
        
        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(20040140, "Dr.Li", 40, "General Practitioner", "jgoisdkh");
        GeneralPractitioner gp2 = new GeneralPractitioner(20040122, "Dr.Liu", 22, "General Practitioner","jgoisdkh");
        GeneralPractitioner gp3 = new GeneralPractitioner(20040159, "Dr.Zhang", 59, "General Practitioner","jgoisdkh");
        
        // 创建两个护士对象
        Nurse nurse1 = new Nurse(20040129, "Dr.Hao", 29, "Nurse","jgoisdkh");
        Nurse nurse2 = new Nurse(20040136, "Dr.Zhai", 36, "Nurse","jgoisdkh");
        
        // 打印所有人员的详细信息
        gp1.printDetails();
        System.out.println(""); // 空行分隔
        gp2.printDetails();
        System.out.println("");
        gp3.printDetails();
        System.out.println("");
        nurse1.printDetails();
        System.out.println("");
        nurse2.printDetails();
        System.out.println("------------------------------");// 作业要求
    
        ArrayList<Appointment> appointments = new ArrayList<>();

        // 创建预约
        createAppointment(appointments, gp1, "John Doe", "1234567890", "2024-11-21 10:00");
        createAppointment(appointments, gp3, "Jane Doe", "0987654321", "2024-11-22 11:00");
        createAppointment(appointments, nurse1, "Tom Smith", "1122334455", "2024-11-23 09:00");
        createAppointment(appointments, nurse2, "Alice Johnson", "2233445566", "2024-11-23 10:00");

        // 打印第一次的四个预约
        printExistingAppointments(appointments);

        // 取消其中一个预约
        cancelBooking(appointments, "1122334455");

        // 打印取消后的结果
        System.out.println("\nUpdated Appointments:");
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    // 创建预约的方法
    public static void createAppointment(ArrayList<Appointment> appointments, HealthProfessional healthProfessional, String patientName, String patientPhone, String appointmentTime) {
        if (patientName != null && patientPhone != null && appointmentTime != null) {
            Appointment appointment = new Appointment( patientName, patientPhone,  appointmentTime,  healthProfessional);
            appointments.add(appointment);
        } else {
            System.out.println("Error: Missing required information to create appointment.");
        }
    }

    // 打印预约的方法
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println();
            }
        }
    }

    // 取消预约的方法
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientPhone) {
        Appointment toCancel = null;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientPhone().equals(patientPhone)) {
                toCancel = appointment;
                break;
            }
        }
        
        if (toCancel != null) {
            appointments.remove(toCancel);
            System.out.println("Appointment cancelled for phone: " + patientPhone);
        } else {
            System.out.println("Error: Appointment not found for the phone number " + patientPhone);
        }
    }
}

