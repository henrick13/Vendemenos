public class Retirada extends Pedido {

    public Retirada(int numero, String cliente, double valor) {
        super(numero, cliente, valor);
    }

    @Override
    public double calcularFrete() {
        return 0.0; // Regra 5: Sem frete
    }

    @Override
    public int obterPrazo() {
        return 0;
    }
}