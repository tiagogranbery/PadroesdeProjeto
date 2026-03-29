package padroescriacao.singleton;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        FabricaSingleton f1 = FabricaSingleton.getInstance();
        FabricaSingleton f2 = FabricaSingleton.getInstance();

        System.out.println(Optional.ofNullable(f1.produzirVeiculo()));
        System.out.println("Mesma instância? " + (f1 == f2));


    }
}