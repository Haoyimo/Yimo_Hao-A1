public class AssignmentOne {
    public static void main(String[] args) {
        // 第3部分 - 使用类和对象
        
        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(20040140, "Dr.Li", 40, "General Practitioner");
        GeneralPractitioner gp2 = new GeneralPractitioner(20040122, "Dr.Liu", 22, "General Practitioner");
        GeneralPractitioner gp3 = new GeneralPractitioner(20040159, "Dr.Zhang", 59, "General Practitioner");
        
        // 创建两个其他类型的卫生专业人员对象
        Nurse nurse1 = new Nurse(20040129, "Dr.Hao", 29, "Nurse");
        Nurse nurse2 = new Nurse(20040136, "Dr.Zhai", 36, "Nurse");
        
        // 打印所有卫生专业人员的详细信息
        gp1.printDetails();
        System.out.println(""); // 空行分隔
        gp2.printDetails();
        System.out.println(""); // 空行分隔
        gp3.printDetails();
        System.out.println(""); // 空行分隔
        nurse1.printDetails();
        System.out.println(""); // 空行分隔
        nurse2.printDetails();
    }
}

