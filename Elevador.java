import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElevadorTest {
    
    @Test
    void testSubir() {
        Elevador elevador = new Elevador(10, 0);
        elevador.subir();
        assertEquals(1, elevador.getAndarAtual());
    }

    @Test
    void testDescer() {
        Elevador elevador = new Elevador(10, 1);
        elevador.descer();
        assertEquals(0, elevador.getAndarAtual());
    }
}

public class Elevador {
    private int totalAndares;
    private int andarAtual;

    public Elevador(int totalAndares, int andarAtual) {
        this.totalAndares = totalAndares;
        this.andarAtual = andarAtual;
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }
}