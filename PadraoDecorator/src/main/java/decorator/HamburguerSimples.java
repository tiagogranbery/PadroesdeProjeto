package decorator;

public class HamburguerSimples implements Hamburguer {

    @Override
    public String getDescricao() {
        return "Hamburguer Simples";
    }

    @Override
    public double getPreco() {
        return 10.0;
    }
}