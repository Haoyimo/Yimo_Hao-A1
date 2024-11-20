public class Nurse extends HealthProfessional {
    private String department;  // 护士所属的科室

    // 默认构造函数
    public Nurse() {
        super();  // 调用父类的默认构造函数
        this.department = "General";
    }

    // 带参数的构造函数
    public Nurse(int id, String name, String description, String department) {
        super(id, name, description);  // 调用父类的带参数构造函数
        this.department = department;
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
        super.printDetails();  // 打印父类的基本信息
        System.out.println("Department: " + department);
    }
}
