package padroescriacao.bridge;

public abstract class Veiculo {

    protected Motor motor;

    public Veiculo(Motor motor) {
        this.motor = motor;
    }

    public abstract String montar();
}