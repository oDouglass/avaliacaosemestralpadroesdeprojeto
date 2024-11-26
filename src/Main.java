
public class Main {
    public static void main(String[] args) {

        // Criando a encomenda
        Encomenda encomenda = new Encomenda(4,new int[]{30, 20, 10}, false, "metropolitana","Transportadora GAVAZZONI");

        // Context do transporte (GerenciadorDeTransporte)
        GerenciadorDeTransporte gerenciador = new GerenciadorDeTransporte(new TransporteTerrestre());
        System.out.println(gerenciador.calcularEntrega(encomenda));

        gerenciador.setEstrategia(new TransporteAereo());
        System.out.println(gerenciador.calcularEntrega(encomenda));

        gerenciador.setEstrategia(new TransporteMaritimo());
        System.out.println(gerenciador.calcularEntrega(encomenda));

        gerenciador.setEstrategia(new TransporteDrone());
        System.out.println(gerenciador.calcularEntrega(encomenda));
    }
}