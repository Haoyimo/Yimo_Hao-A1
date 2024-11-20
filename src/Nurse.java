public class Nurse extends HealthProfessional {
    private int id;      //Set variables    
    private String name;    
    private int age;           
    private String certificate;  
    private String healthProfessionalDetails; 

    //Constructor function
    public Nurse() {
        super();  //Call the default constructor of the parent class
        this.id = 0;           
        this.name = "";   
        this.age = 0;            
        this.certificate = ""; 
        this.healthProfessionalDetails = "";
    }

    //Constructor with parameters, initialize all instance variables
    public Nurse(int id, String name, int age, String certificate, String healthProfessionalDetails) {
        super(id, name, age);  //Call the constructor of the parent class
        this.id = id;         
        this.name = name;     
        this.age = age;     
        this.certificate = certificate;  
        this.healthProfessionalDetails = healthProfessionalDetails;  
    }

    //Using Getters and Setters to Set and Retrieve Variables
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getHealthProfessionalDetails() {
        return healthProfessionalDetails;
    }

    public void setHealthProfessionalDetails(String healthProfessionalDetails) {
        this.healthProfessionalDetails = healthProfessionalDetails;
    }

    //Print results
    @Override
    public void printDetails() {
        System.out.println("ID: " + id);  
        System.out.println("Name: " + name);  
        System.out.println("Age: " + age);    
        System.out.println("Certificate: " + certificate);  
        System.out.println("Health Professional Details: " + healthProfessionalDetails);  
    }
}

