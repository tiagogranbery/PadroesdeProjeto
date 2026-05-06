package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HamburguerSimplesTest {

    @Test
    void deveRetornarPrecoCorreto() {
        Hamburguer h = new HamburguerSimples();
        assertEquals(10.0, h.getPreco());
    }
}