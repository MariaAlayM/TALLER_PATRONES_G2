public class DepartamentoLogistica {

private EstrategiaDistribucion estrategia;

public DepartamentoLogistica() {
}
    public void setEstrategia(EstrategiaDistribucion estrategia) {
    this.estrategia = estrategia;
}

public void distribuir() {

if (estrategia == null) {
    System.out.println("No se ha seleccionado una estrategia de distribución.");
    return;
}
estrategia.distribuir();
}

}