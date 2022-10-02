public class Person {
    private String surname;
    private String name;
    private int age;

    public Person(String surname, String name, int age){
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age= age;
    }

    public int getAge(){
        return age;
    }

    public String printInfo(){
        String info = "Name and surname: " + getName() + " " + getSurname() + ". Age: " + getAge();
        return info;
    }
}