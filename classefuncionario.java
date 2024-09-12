import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    
    @Test
    void testCalcularInss() {
        Funcionario funcionario = new Funcionario("Maria", 6000);
        assertEquals(600, funcionario.calcularInss());
    }

    @Test
    void testInssAbaixoLimite() {
        Funcionario funcionario = new Funcionario("João", 4000);
        assertEquals(0, funcionario.calcularInss());
    }
}


public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularInss() {
        if (this.salario > 5000) {
            return this.salario * 0.10;
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}