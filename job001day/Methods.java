package job001day;

public class Methods {
    public static void main(String[] args) {
        Constr person = new Constr("Anower ", 22, "Daejeon", "45678");

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Address: " + person.address);
        System.out.println("Phone Number: " + person.phoneNumber);

    }
}
