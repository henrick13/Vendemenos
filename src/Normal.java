public class Normal extends Pedido {

    public Normal(int numero, String cliente, double valor) {
        super(numero, cliente, valor);
    }

    @Override
    public double calcularFrete() {
        return 15.00;
    }

    @Override
    public int obterPrazo() {
        return 7; // Regra 3: 7 dias
    }
}