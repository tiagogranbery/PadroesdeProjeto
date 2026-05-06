package decorator;

public class HamburguerArtesanal implements Hamburguer {

    @Override
    public String getDescricao() {
        return "Hamburguer Artesanal";
    }

    @Override
    public double getPreco() {
        return 18.0;
    }
}