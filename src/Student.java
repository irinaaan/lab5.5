public class Student extends Person{
    private int group;
    private int studentID;

    public Student(String surname, String name, int age, int group, int studentID){
        super (surname, name, age);
        this.group = group;
        this.studentID = studentID;
    }

    public void setGroup(int group){
        this.group = group;
    }

    public int getGroup(){
        return group;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public int getStudentID(){
        return studentID;
    }

    public String printInfo(){
        String info = ". Group: " + getGroup() + ". StudentID: " + getStudentID();
        return super.printInfo() + info;
    }
}