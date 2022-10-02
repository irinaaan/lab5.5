public class Lecturer extends Person {
    private String department;
    private int payment;

    public Lecturer(String surname, String name, int age, String department, int payment) {
        super (surname, name, age);
        this.department = department;
        this.payment = payment;
    }

    public void setDepartment(String department){
        this.department = department;
    }


    public String getDepartment(){
        return department;
    }

    public void setPayment(int payment){
        this.payment = payment;
    }

    public int getPayment(){
        return payment;
    }

    public String printInfo(){
        String info = ". Department: " + getDepartment() + ". Payment: " + getPayment();
        return super.printInfo() + info;
    }
}