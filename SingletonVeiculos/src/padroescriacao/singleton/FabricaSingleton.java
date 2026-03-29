package padroescriacao.singleton;

public class FabricaSingleton {

    private static FabricaSingleton instance;

    private FabricaSingleton() {}

    public static FabricaSingleton getInstance() {
        if (instance == null) {
            instance = new FabricaSingleton();
        }
        return instance;
    }

    public String produzirVeiculo() {
        return "Produzindo veiculo unico";
    }
}