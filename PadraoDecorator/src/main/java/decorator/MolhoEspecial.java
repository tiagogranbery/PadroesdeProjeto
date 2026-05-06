package decorator;

public class MolhoEspecial extends HamburguerDecorator {

    public MolhoEspecial(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Molho Especial";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.5;
    }
}