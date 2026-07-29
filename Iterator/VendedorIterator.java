import java.util.List;

public class VendedorIterator implements ActorIterator{
    private final Bodega inventarioVendedor;
    private int posicion = 0;

    public VendedorIterator(Bodega inventarioVendedor){
        this.inventarioVendedor = inventarioVendedor;

    }

    @Override
    public Producto getNext() {
        List<Producto> productos = inventarioVendedor.getProductos();
        if(this.hasMore()){
            Producto producto = productos.get(posicion);
            posicion++;
            return producto;
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        List<Producto> productos = inventarioVendedor.getProductos();
        return posicion < productos.size();
    }
    
}
