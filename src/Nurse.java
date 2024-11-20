public class Nurse extends HealthProfessional {
    private int id;      // 设置变量      
    private String name;    
    private int age;           
    private String certificate;  
    private String healthProfessionalDetails; 

    // 构造函数
    public Nurse() {
        super();  // 调用父类的默认构造函数
        this.id = 0;           
        this.name = "";   
        this.age = 0;            
        this.certificate = ""; 
        this.healthProfessionalDetails = "";
    }

    // 带参数的构造函数，初始化所有实例变量
    public Nurse(int id, String name, int age, String certificate, String healthProfessionalDetails) {
        super(id, name, age);  // 调用父类的构造函数
        this.id = id;         
        this.name = name;     
        this.age = age;     
        this.certificate = certificate;  
        this.healthProfessionalDetails = healthProfessionalDetails;  
    }

    // 使用getter和setter来设置和获取变量
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

    // 打印结果
    @Override
    public void printDetails() {
        System.out.println("ID: " + id);  
        System.out.println("Name: " + name);  
        System.out.println("Age: " + age);    
        System.out.println("Certificate: " + certificate);  
        System.out.println("Health Professional Details: " + healthProfessionalDetails);  
    }
}

