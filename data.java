import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void testDataValida() {
        Data data = new Data(15, 3, 2023);
        assertTrue(data.isValid());
    }

    @Test
    void testDataInvalida() {
        Data data = new Data(32, 3, 2023);
        assertFalse(data.isValid());
    }

    @Test
    void testDataInvalidaFevereiro() {
        Data data = new Data(30, 2, 2023);
        assertFalse(data.isValid());
    }

    @Test
    void testDataValidaAnoBissexto() {
        Data data = new Data(29, 2, 2024); // 2024 é um ano bissexto
        assertTrue(data.isValid());
    }

    @Test
    void testDataInvalidaAnoNaoBissexto() {
        Data data = new Data(29, 2, 2023); // 2023 não é um ano bissexto
        assertFalse(data.isValid());
    }
}


public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean isValid() {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > 31) {
            return false;
        }
        if (mes == 2) {
            if (isAnoBissexto()) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }
        return true;
    }

    private boolean isAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }
        return false;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}