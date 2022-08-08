public class PartTimeEmployee extends Empolyee{
    private int workHours;
    private int wage;

    public PartTimeEmployee(int id,String name, int workHours, int wage) {
        super(name, id);
        this.workHours = workHours;
        this.wage = wage;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public double computeAmount() {
        return this.getWorkHours()*this.getWage();
    }
}
