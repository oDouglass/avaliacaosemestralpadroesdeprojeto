public class TransporteMaritimo implements iTransporteStrategy {

    @Override
    public String calcularEntrega(Encomenda encomenda) {

        if (encomenda.internacional = true) {
            return "Tua entrega marítima está disponível para envio internacional.";
        }
        return "Transporte marítimo é restrito a entregas internacionais.";
    }

}
