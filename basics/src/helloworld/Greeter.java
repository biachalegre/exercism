//exercism.org/tracks/java/exercises/hello-world

package helloworld;

public class Greeter {

    public String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.getGreeting();
    }
}
