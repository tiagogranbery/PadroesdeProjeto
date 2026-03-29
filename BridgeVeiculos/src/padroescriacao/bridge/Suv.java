package padroescriacao.bridge;

public class Suv extends Veiculo {

    public Suv(Motor motor) {
        super(motor);
    }

    public String montar() {
        return "SUV com " + motor.tipoMotor();
    }
}