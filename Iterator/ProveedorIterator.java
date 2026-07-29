import java.util.List;

public class ProveedorIterator implements ActorIterator{
    private final Bodega inventarioProveedor;
    private int posicion = 0;

    public ProveedorIterator(Bodega inventarioProveedor){
        this.inventarioProveedor = inventarioProveedor;
    }

    @Override
    public Producto getNext() {
        List<Producto> productos = inventarioProveedor.getProductos();
        if(this.hasMore()){
            Producto producto = productos.get(posicion);
            posicion++;
            return producto;
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        List<Producto> productos = inventarioProveedor.getProductos();
        return posicion < productos.size();
    }
    
}
