import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Payable> list;

    public Company(String name) {
        this.name = name;
        list=new ArrayList<Payable>();
    }
    public boolean add(Payable p){
        list.add(p);
        return true;
    }
    public double computeAmount(){
        double amount=0.0;
        for (int i = 0; i < list.size(); i++) {
            amount=amount+ list.get(i).computeAmount();
        }
        return amount;
    }

    @Override
    public String toString() {
        return "Company{" + "payables=" + list +", name='"+name+"'}";
    }
}
