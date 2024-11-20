public class GeneralPractitioner extends HealthProfessional {
    private int id;             // 必需的实例变量：ID（仅限数字）
    private String name;        // 必需的实例变量：名称
    private int age;            // 与年龄相关的实例变量
    private String specialty;   // 医生的专长领域

    // 默认构造函数
    public GeneralPractitioner() {
        super();  // 调用父类的默认构造函数
        this.id = 0;             // 默认ID为0
        this.name = "Unknown";    // 默认名称为"Unknown"
        this.age = 0;            // 默认年龄为0
        this.specialty = "General Practitioner";  // 默认专长为General Practitioner
    }

    // 带参数的构造函数，初始化所有实例变量
    public GeneralPractitioner(int id, String name, int age, String specialty) {
        super(id, name, age);  // 调用父类的构造函数
        this.id = id;     // 初始化ID
        this.name = name; // 初始化名称
        this.age = age;   // 初始化年龄
        this.specialty = specialty;  // 初始化专长
    }

    // 获取医生的年龄
    public int getAge() {
        return age;
    }

    // 设置医生的年龄
    public void setAge(int age) {
        this.age = age;
    }

    // 获取医生的专长
    public String getSpecialty() {
        return specialty;
    }

    // 设置医生的专长
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // 打印医生的详细信息（覆盖父类的方法）
    @Override
    public void printDetails() {
        System.out.println("Health Professional Details: GeneralPractitioner ");//详细信息的录入
        System.out.println("ID: " + id);  
        System.out.println("Name: " + name);  
        System.out.println("Age: " + age);    
        System.out.println("Specialty: " + specialty);  
    }
}


