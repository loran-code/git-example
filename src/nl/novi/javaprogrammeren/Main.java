package nl.novi.javaprogrammeren;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Wereld!");

        Person p = new Person("Sjaak");
        Person a = new Person("Sjohn");

        System.out.println(p.getName());
        System.out.println(a.getName());
        System.out.println(a.getName());
    }
}
