class Calculation {

    public void fact(int i) {
    }
    
}

public class objectcreation {
    public static void main(String[] args) {

        new Calculation();  //anonymus object

        Calculation c = new Calculation(); // Calling method through a reference
        c.fact(5);  

        new Calculation().fact(5);


    }
}
