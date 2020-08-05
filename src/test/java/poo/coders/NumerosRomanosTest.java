package poo.coders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosRomanosTest {
    private NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    public void pasar1ARomanos() {
        String romano = numerosRomanos.convertirARomanos(1);

        assertEquals(romano, "I");
    }

    @Test
    public void pasar2ARomanos() {
        String romano = numerosRomanos.convertirARomanos(2);

        assertEquals(romano, "II");
    }

    @Test
    public void pasar3ARomanos() {
        String romano = numerosRomanos.convertirARomanos(3);
        assertEquals(romano, "III");
    }

    @Test
    public void pasar4ARomanos() {
        String romano = numerosRomanos.convertirARomanos(4);

        assertEquals(romano, "IV");
    }

    @Test
    public void pasar5ARomanos() {
        String romano = numerosRomanos.convertirARomanos(5);
        assertEquals(romano, "V");
    }

    @Test
    public void pasar6ARomanos() {
        String romano = numerosRomanos.convertirARomanos(6);
        assertEquals(romano, "VI");
    }

    @Test
    public void pasarA7Romanos() {
        String romano = numerosRomanos.convertirARomanos(7);
        assertEquals(romano, "VII");
    }

    @Test
    public void pasarA8Romanos() {
        String romano = numerosRomanos.convertirARomanos(8);
        assertEquals(romano, "VIII");
    }

    @Test
    public void pasarA9Romanos() {
        String romano = numerosRomanos.convertirARomanos(9);
        assertEquals(romano, "IX");
    }


}
