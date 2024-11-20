public class Nurse extends HealthProfessional {
    private int id;             // 必需的实例变量：ID（仅限数字）
    private String name;        // 必需的实例变量：名称
    private int age;            // 与年龄相关的实例变量
    private String department;  // 护士所在的科室

    // 默认构造函数
    public Nurse() {
        super();  // 调用父类的默认构造函数
        this.id = 0;             // 默认ID为0
        this.name = "Unknown";    // 默认名称为"Unknown"
        this.age = 0;            // 默认年龄为0
        this.department = "General Nursing";  // 默认科室为General Nursing
    }

    // 带参数的构造函数，初始化所有实例变量
    public Nurse(int id, String name, int age, String department) {
        super(id, name, age);  // 调用父类的构造函数
        this.id = id;           // 初始化ID
        this.name = name;       // 初始化名称
        this.age = age;         // 初始化年龄
        this.department = department;  // 初始化科室
    }

    // 获取护士的年龄
    public int getAge() {
        return age;
    }

    // 设置护士的年龄
    public void setAge(int age) {
        this.age = age;
    }

    // 获取护士的科室
    public String getDepartment() {
        return department;
    }

    // 设置护士的科室
    public void setDepartment(String department) {
        this.department = department;
    }

    // 打印护士的详细信息（覆盖父类的方法）
    @Override
    public void printDetails() {
        System.out.println("Health Professional Details: Nurse ");//详细信息的录入
        System.out.println("ID: " + id);  
        System.out.println("Name: " + name);  
        System.out.println("Age: " + age);    
        System.out.println("Specialty: " + department);  
    }
}