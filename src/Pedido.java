public class Pedido {
    public int numero;
    public String cliente;
    public double valor;

    public Pedido(int numero, String cliente, double valor) {
        if (valor <= 0) {
            IO.println("O valor deve ser acima de 0,00");
        }

        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularTotal() {
        return valor + calcularFrete();
    }

    public double calcularFrete() {
        return 0.0;
    }

    public void processar() {
        IO.println("Pedido #" + numero + " - Cliente: " + cliente);
        IO.println("Valor Produtos: R$ " + valor);
        IO.println("Frete: R$ " + calcularFrete());
        IO.println("Prazo: " + obterPrazo() + " dias");
        IO.println("Total: R$ " + calcularTotal());
    }

    public int obterPrazo() {
        return 0;
    }
}