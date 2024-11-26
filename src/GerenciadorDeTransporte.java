public class GerenciadorDeTransporte {

    private iTransporteStrategy strategy;

    public GerenciadorDeTransporte(iTransporteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setEstrategia(iTransporteStrategy novastrategy) {
        this.strategy = novastrategy;
    }

    public String calcularEntrega(Encomenda encomenda) {
        return strategy.calcularEntrega(encomenda);
    }

}
