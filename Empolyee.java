public abstract class Empolyee implements Payable {
    private String name;
    private int id;

    public Empolyee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }
}
