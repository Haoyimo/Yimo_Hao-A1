public class GeneralPractitioner extends HealthProfessional {
    private int id;             // 必需的实例变量：ID（仅限数字）
    private String name;        // 必需的实例变量：名称
    private int age;            // 与年龄相关的实例变量
    private String certificate; // 医生的证书领域
    private String healthProfessionalDetails; // 医生介绍：医生的详细信息

    // 默认构造函数
    public GeneralPractitioner() {
        super();  // 调用父类的默认构造函数
        this.id = 0;             // 默认ID为0
        this.name = "Unknown";    // 默认名称为"Unknown"
        this.age = 0;            // 默认年龄为0
        this.certificate = "General Practitioner";  // 默认证书为General Practitioner
        this.healthProfessionalDetails = "No additional details"; // 默认值
    }

    // 带参数的构造函数，初始化所有实例变量
    public GeneralPractitioner(int id, String name, int age, String certificate, String healthProfessionalDetails) {
        super(id, name, age);  // 调用父类的构造函数
        this.id = id;     // 初始化ID
        this.name = name; // 初始化名称
        this.age = age;   // 初始化年龄
        this.certificate = certificate;  // 初始化证书
        this.healthProfessionalDetails = healthProfessionalDetails; // 初始化详细信息
    }

    // 获取医生的证书
    public String getCertificate() {
        return certificate;
    }

    // 设置医生的证书
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    // 获取医生的详细信息
    public String getHealthProfessionalDetails() {
        return healthProfessionalDetails;
    }

    // 设置医生的详细信息
    public void setHealthProfessionalDetails(String healthProfessionalDetails) {
        this.healthProfessionalDetails = healthProfessionalDetails;
    }

    // 打印医生的详细信息（覆盖父类的方法）
    @Override
    public void printDetails() {
        System.out.println("ID: " + id);  
        System.out.println("Name: " + name);  
        System.out.println("Age: " + age);    
        System.out.println("Certificate: " + certificate);  // 输出医生的证书信息
        System.out.println("Health Professional Details: " + healthProfessionalDetails);  // 输出详细信息
    }
}


