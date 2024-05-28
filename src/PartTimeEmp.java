public class PartTimeEmp extends Employee{

    private int nbWorkHours;
    private int rate;

    public PartTimeEmp(String name, int id) {
        super(name, id);
    }

    public PartTimeEmp(PartTimeEmp p){
        super();
    }
    public void display(){

    }
    public double calculatePay(){
        return 0;
    }

    public int getRate() {
        return rate;
    }

    public int getNbWorkHours() {
        return nbWorkHours;
    }
}
