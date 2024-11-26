public class Encomenda {

    public double peso;
    public int[] dimensoes;
    public boolean internacional;
    public String area;
    public String transportadoraLocal;

    // Construtor
    public Encomenda(double peso, int[] dimensoes, boolean internacional, String area, String transportadoraLocal) {
        this.peso = peso;
        this.dimensoes = dimensoes;
        this.internacional = internacional;
        this.area = area;
        this.transportadoraLocal = transportadoraLocal;
    }

}
