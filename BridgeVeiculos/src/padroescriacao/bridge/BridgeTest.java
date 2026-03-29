package padroescriacao.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    void deveMontarSedanEletrico() {
        Veiculo v = new Sedan(new MotorEletrico());

        assertEquals("Sedan com Motor Eletrico", v.montar());
    }

    @Test
    void deveMontarSUVCombustao() {
        Veiculo v = new Suv(new MotorCombustao());

        assertEquals("Suv com Motor Combustao", v.montar());
    }
}