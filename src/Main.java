public class Main {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Shevchenko", "Vladimir",35, "English Philology and Translation", 13000);
        Lecturer lecturer2 = new Lecturer("Kosach", "Alexandr",28, "Biomedical Engineering", 10000);
        Lecturer lecturer3 = new Lecturer("Kovalenko", "Vladislav",30, "Information Technology", 11200);
        Student student1 = new Student("Vasilenko", "Victoriya", 19, 123,323132242);
        Student student2 = new Student("Kovalchuk", "Olga", 20, 521, 56564656);
        Student student3 = new Student("Slobodyanyuk", "Tamara", 17, 122, 32424342);

        Person persArray[] = new Person[]{lecturer1, lecturer2, lecturer3, student1, student2, student3};

        for (Person p : persArray) {
            System.out.println(p.printInfo());
        }
    }
}