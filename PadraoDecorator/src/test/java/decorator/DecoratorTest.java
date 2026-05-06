package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    void deveAdicionarIngredientes() {
        Hamburguer h = new HamburguerSimples();
        h = new Queijo(h);
        h = new Bacon(h);

        assertEquals("Hamburguer Simples, Queijo, Bacon", h.getDescricao());
        assertEquals(15.5, h.getPreco());
    }
}