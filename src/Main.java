public static void main(String[] args) {
        Pedido p1 = new Normal(101, "Grazy Topper", 150.00);
        p1.processar();


        Pedido p2 = new Expresso(102, "Sol", 200.00);
        p2.processar();


        Pedido p3 = new Retirada(103, "Leão", 80.00);
        p3.processar();
    }
