import java.util.Arrays;

public class Programmer extends Employee {
    private String[] programmingLanguages;

    public Programmer(String name, String address, String phoneNumber, float experience) {
        super(name, address, phoneNumber, experience);
        this.programmingLanguages = new String[10];
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void addProgrammingLanguage (String language) {

        int index = 0;
        boolean found = false;

        while (!found){
            if (programmingLanguages[index] == null) {
                programmingLanguages[index] = language;
                found = true;
            }
            index++;
        }
    }

    public void removeProgrammingLanguage (String language) {
        int index = 0;
        boolean found = false;

        while (!found){
            if (programmingLanguages[index] == language) {
                programmingLanguages[index] = null;
                found = true;
            }
            index++;
        }
    }

    public void writeCode(){
        System.out.println("writing code");
    }

    @Override
    public String toString() {
        return  "Programmer { " +
                super.toString() +
                ", programmingLanguages=" + Arrays.toString(programmingLanguages) +
                " }";
    }
}
