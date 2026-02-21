public class ProgrammingConceptDemo {

    public static void main(String[] args) {

        int salary = 100000;
        int increment = salary * 10 / 100;
        salary = salary + increment;

        System.out.println("Old Salary = 100000");
        System.out.println("Increment = " + increment);
        System.out.println("New Salary = " + salary);
    }
}