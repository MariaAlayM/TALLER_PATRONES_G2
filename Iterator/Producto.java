public class Producto{
    private String id;
    private String nombre;
    private int stock;
    private boolean estado;
    private boolean enGarantia;

    public Producto(){}

    public String getNombre(){return nombre;}
    public int getStock() {return stock;}
    public boolean getEstado() {return estado;} 
    public boolean getGarantia(){return enGarantia;}
}