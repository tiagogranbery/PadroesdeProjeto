package padroescriacao.bridge;

public class Sedan extends Veiculo {

    public Sedan(Motor motor) {
        super(motor);
    }

    public String montar() {
        return "Sedan com " + motor.tipoMotor();
    }
}