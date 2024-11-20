public class HealthProfessional {
    private int id;          //Set variables
    private String name;    
    private int age;        

    //Constructor function
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.age = 0; 
    }

    //Initialize the constructor of all variables
    public HealthProfessional(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Method for printing all instance variables
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //Using Getters and Setters to Set and Retrieve Variables
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
