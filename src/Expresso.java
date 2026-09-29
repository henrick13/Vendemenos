public class Expresso extends Pedido {

    public Expresso(int numero, String cliente, double valor) {
        super(numero, cliente, valor);
    }

    @Override
    public double calcularFrete() {
        return 30.00;
    }

    @Override
    public int obterPrazo() {
        return 2; // Regra 4: 2 dias
    }
}