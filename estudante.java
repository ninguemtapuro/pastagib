import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {

    @Test
    void testCalcularMedia() {
        Estudante estudante = new Estudante("Carlos", new double[]{8, 7, 9, 6});
        assertEquals(7.5, estudante.calcularMedia(), 0.01);
    }
}

public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }
}