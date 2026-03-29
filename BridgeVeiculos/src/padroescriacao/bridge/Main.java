package padroescriacao.bridge;

public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Sedan(new MotorEletrico());
        Veiculo v2 = new Suv(new MotorCombustao());

        System.out.println(v1.montar());
        System.out.println(v2.montar());
    }
}