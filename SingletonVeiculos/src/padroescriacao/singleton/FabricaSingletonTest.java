package padroescriacao.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FabricaSingletonTest {

    @Test
    void deveRetornarMesmaInstancia() {
        FabricaSingleton f1 = FabricaSingleton.getInstance();
        FabricaSingleton f2 = FabricaSingleton.getInstance();

        assertSame(f1, f2);
    }
}