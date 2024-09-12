import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {
    
    @Test
    void testAcelerar() {
        Veiculo veiculo = new Veiculo("Carro", "Ford", 2023, 0);
        veiculo.acelerar(20);
        assertEquals(20, veiculo.getVelocidade());
    }

    @Test
    void testFrear() {
        Veiculo veiculo = new Veiculo("Carro", "Ford", 2023, 50);
        veiculo.frear(20);
        assertEquals(30, veiculo.getVelocidade());
    }

    @Test
    void testParar() {
        Veiculo veiculo = new Veiculo("Carro", "Ford", 2023, 50);
        veiculo.parar();
        assertEquals(0, veiculo.getVelocidade());
    }
}


public class Veiculo {
    private String tipo;
    private String marca;
    private int ano;
    private int velocidade;

    public Veiculo(String tipo, String marca, int ano, int velocidade) {
        this.tipo = tipo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void acelerar(int incremento) {
        this.velocidade += incremento;
    }

    public void frear(int decremento) {
        this.velocidade -= decremento;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }

    public void parar() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }
}