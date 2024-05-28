public class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {}
    public Employee (Employee e) {}

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public void display (){
        System.out.println("Name: " + name);
    }
    public double calculatePay(){
        return 0;
    }
}
