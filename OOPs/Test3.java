class Student {
    int id;
    String name;

    //initialize by method

    void insertRecord(int i, String n) {
        id = i;
        name = n;
    }

    void print() {
        System.out.println(id + " " + name);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insertRecord(8,"ji");
        s1.print();
    }
}
