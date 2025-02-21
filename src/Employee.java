public abstract class Employee {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected float experience;

    protected int facebookID = 0;

    public Employee(String name, String address, String phoneNumber, float experience){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.facebookID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public int getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(int facebookID) {
        this.facebookID = facebookID;
    }
}
