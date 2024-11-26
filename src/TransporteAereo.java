public class TransporteAereo implements iTransporteStrategy {

    @Override
    public String calcularEntrega(Encomenda encomenda) {

        double peso = encomenda.peso;
        int[] dimensoes = encomenda.dimensoes;

        if (peso > 50 || dimensoes[0] > 150 || dimensoes[1] > 150 || dimensoes[2] > 150) {
            return "Tua encomenda excede peso ou dimensões para usar o transporte aéreo.";
        }
        return "Entrega aérea está disponível para sua encomenda.";
    }
}
