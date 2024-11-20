public class HealthProfessional {
    // 实例变量
    private int id;          // ID，仅限数字
    private String name;     // 名称
    private int age;         // 年龄，替换了原来的 description 变量

    // 默认构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.age = 0; // 默认年龄为 0
    }

    // 初始化所有实例变量的构造函数
    public HealthProfessional(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); // 输出年龄
    }

    // Getter 和 Setter 方法
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
        return age; // 获取年龄
    }

    public void setAge(int age) {
        this.age = age; // 设置年龄
    }
}
