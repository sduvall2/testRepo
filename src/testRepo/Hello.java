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
        System.out.println("This is Shannon's new work.  Shouldn't be in main yet.");
    }

    /**
     * Start of the program.
     */
    public static void main (String[] args) {
        Hello hello = new Hello();

        System.out.println("Version: " + hello.getVersion());
        System.out.println("Robert's Change.");
        hello.sayHello("world!");
    }
}
