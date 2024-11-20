import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        //Part 3: Using Classes and Objects
        
        //Create three general practitioner clients
        GeneralPractitioner gp1 = new GeneralPractitioner(20040140, "Dr.Li", 40, "General Practitioner", "Dr. Li is responsible and has excellent medical skills for daily colds and fevers");
        GeneralPractitioner gp2 = new GeneralPractitioner(20040122, "Dr.Liu", 22, "General Practitioner","Dr. Liu has a deeper understanding of gastrointestinal diseases. If you have any problems with your digestive system, you can make an appointment with him");
        GeneralPractitioner gp3 = new GeneralPractitioner(20040159, "Dr.Zhang", 59, "General Practitioner","Dr. Zhang has conducted in-depth research on headaches. When you have a headache and don't know if you need medication, you can try making an appointment");
        
        //Create two nurse objects
        Nurse nurse1 = new Nurse(20040129, "Dr.Hao", 29, "Nurse","Nurse Hao has excellent skills in taking care of patients. When you feel uncomfortable or need intravenous infusion, you can go to him");
        Nurse nurse2 = new Nurse(20040136, "Dr.Zhai", 36, "Nurse","If you accidentally fall during exercise and suffer a fracture or injury, Dr. Zhai can help you bandage the wound");
        
        //Print detailed information of all personnel
        gp1.printDetails();
        System.out.println(""); //Blank line separation
        gp2.printDetails();
        System.out.println("");
        gp3.printDetails();
        System.out.println("");
        nurse1.printDetails();
        System.out.println("");
        nurse2.printDetails();
        System.out.println("------------------------------");//Homework requirements
    
        ArrayList<Appointment> appointments = new ArrayList<>();

        //Create Appointment
        createAppointment(appointments, gp1, "Kaisi", "15932099037", "2024-11-21 10:23");
        createAppointment(appointments, gp3, "Bob", "13730557655", "2024-11-22 11:59");
        createAppointment(appointments, nurse1, "Carl", "15933397668", "2024-11-24 09:14");
        createAppointment(appointments, nurse2, "Mike", "13731579052", "2024-11-23 10:01");

        //Print the first four appointments
        printExistingAppointments(appointments);

        //Cancel one of the appointments
        cancelBooking(appointments, "13730557655");

        //Print the result after cancellation
        System.out.println("\nUpdated Appointments:");
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    //Method for creating an appointment
    public static void createAppointment(ArrayList<Appointment> appointments, HealthProfessional healthProfessional, String patientName, String patientPhone, String appointmentTime) {
        if (patientName != null && patientPhone != null && appointmentTime != null) {
            Appointment appointment = new Appointment( patientName, patientPhone,  appointmentTime,  healthProfessional);
            appointments.add(appointment);
            System.out.println("Appointment successful, wish you a speedy recovery");
        } else {
            System.out.println("Error: Missing required information to create appointment.");
        }
    }

    //Method of printing reservation
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

    //Method to cancel appointment
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
            System.out.println("You have successfully cancelled the appointment");
        } else {
            System.out.println("Error: Appointment not found for the phone number " + patientPhone);
        }
    }
}

