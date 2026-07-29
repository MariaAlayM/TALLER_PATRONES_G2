import java.util.List;

public class MantenimientoIterator implements ActorIterator{
    private final Bodega inventarioMantenimiento;
    private int posicion = 0;

    public MantenimientoIterator(Bodega inventarioMantenimiento){
        this.inventarioMantenimiento = inventarioMantenimiento;
    }
    @Override
    public Producto getNext() {
        List<Producto> productos = inventarioMantenimiento.getProductos();
        if(this.hasMore()){
            Producto producto = productos.get(posicion);
            posicion++;
            return producto;
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        List<Producto> productos = inventarioMantenimiento.getProductos();
        return posicion < productos.size();
    }
    
}
