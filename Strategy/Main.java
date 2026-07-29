public class Main {

public static void main(String[] args) {

DepartamentoLogistica departamento = new DepartamentoLogistica();

departamento.setEstrategia(new DistribucionAutomotriz());
departamento.distribuir();

departamento.setEstrategia(new DistribucionCiclista());
departamento.distribuir();

departamento.setEstrategia(new DistribucionFluvial());
departamento.distribuir();

departamento.setEstrategia(new DistribucionFerrea());
departamento.distribuir();

departamento.setEstrategia(new DistribucionAerea());
departamento.distribuir();
}

}