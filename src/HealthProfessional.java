public class HealthProfessional {
    // 实例变量
    private int id;          // ID，仅限数字
    private String name;     // 名称
    private String description; // 与描述基本信息相关的实例变量，通用信息

    // 默认构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.description = "No description available";
    }

    // 初始化所有实例变量的构造函数
    public HealthProfessional(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
