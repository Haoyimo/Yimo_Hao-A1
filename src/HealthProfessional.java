public class HealthProfessional {
    private int id;          // 设置变量
    private String name;    
    private int age;        

    // 构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.age = 0; 
    }

    // 初始化所有变量的构造函数
    public HealthProfessional(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // 使用getter和setter来设置和获取变量
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; 
    }
}
