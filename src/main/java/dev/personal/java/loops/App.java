package dev.personal.java.loops;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       JavaLoops tabla = new JavaLoops(6, 10);
       tabla.multiplicationTable();
       
       System.out.println(tabla.multiplicationTable());
    }
}
