package testRepo;
/**
 * Feel free to completely change this code or delete it entirely. 
 */
public class Hello {
    /**
     * A method to test (and a joke :).
     */
    public double getVersion () {
        return 0.001;
    }

    public void sayHello (String name) {
        System.out.println("Hello " + name);
    }

    /**
     * Start of the program.
     */
    public static void main (String[] args) {
        Hello hello = new Hello();

        System.out.println("Version: " + hello.getVersion());
        System.out.println("Robert's Change.");
        System.out.println("Robert's Next Change.");
        hello.sayHello("world!");
    }
}
