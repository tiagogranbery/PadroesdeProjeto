package decorator;

public class Main {

    public static void main(String[] args) {

        Hamburguer pedido = new HamburguerArtesanal();
        pedido = new Queijo(pedido);
        pedido = new Bacon(pedido);
        pedido = new MolhoEspecial(pedido);

        System.out.println("Pedido: " + pedido.getDescricao());
        System.out.println("Preço: R$ " + pedido.getPreco());
    }
}