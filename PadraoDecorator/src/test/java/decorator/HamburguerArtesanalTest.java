package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HamburguerArtesanalTest {

    @Test
    void deveRetornarPrecoCorreto() {
        Hamburguer h = new HamburguerArtesanal();
        assertEquals(18.0, h.getPreco());
    }
}