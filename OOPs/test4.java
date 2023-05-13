class Employee {
    int id;
    String name;

    Employee() {
        System.out.println("hi");
    }

    Employee(int i, String n) {
        id = i;
        name = n;
    }

    void dispplay() {
        System.out.println(id + " " +name);
}
}

public class test4 {
    public static void main(String[] args) {
        Employee em1 = new Employee(12,"bruce");
        em1.dispplay();
    }
}



