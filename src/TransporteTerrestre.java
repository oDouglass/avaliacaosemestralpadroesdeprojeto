public class TransporteTerrestre implements iTransporteStrategy {

    @Override
    public String calcularEntrega(Encomenda encomenda) {

        String transportadora = encomenda.transportadoraLocal != null
                ? encomenda.transportadoraLocal
                : "Transportadora Padrão";
        return "Entrega terrestre via " + transportadora + ".";

    }
}