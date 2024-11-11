package dev.personal.java.loops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class javaLoopsTest {
    @Test
    void testMultiplicationTable() {

        JavaLoops tabla = new JavaLoops(5,10);
        
        String actual = tabla.multiplicationTable(); 
        String expected = "5x1=5\n5x2=10\n5x3=15\n5x4=20\n5x5=25\n5x6=30\n5x7=35\n5x8=40\n5x9=45\n5x10=50\n";
        
        
        assertEquals(expected, actual);
    }
}
