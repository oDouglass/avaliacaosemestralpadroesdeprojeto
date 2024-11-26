public class TransporteDrone implements iTransporteStrategy {

    @Override
    public String calcularEntrega(Encomenda encomenda) {

        String area = encomenda.area;
        double peso = encomenda.peso;

        if (!"metropolitana".equalsIgnoreCase(area) || peso > 5) {
            return "A entrega por drones está indisponível para sua encomenda.";
        }
        return "Entrega por drones disponível.";
    }

}
