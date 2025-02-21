public class Manager extends Employee{
    private int size;

    public Manager(String name, String address, String phoneNumber, float experience, int size) {
        super(name, address, phoneNumber, experience);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void reportProjectStatus(int size){
        System.out.println("report Project Status");
    }

    @Override
    public String toString() {
        return "Manager {" +
                super.toString() +
                ", size=" + size +
                " }";
    }
}
