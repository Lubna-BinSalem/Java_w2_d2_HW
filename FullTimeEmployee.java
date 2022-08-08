public class FullTimeEmployee extends Empolyee{
    private int weeklySalary;

    public FullTimeEmployee(int id,String name, int weeklySalary) {
        super(name, id);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double computeAmount() {
        return 4*this.getWeeklySalary();
    }
}
