//https://exercism.org/tracks/java/exercises/hello-world

public class Greeter {

    public String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.getGreeting());
    }
}
