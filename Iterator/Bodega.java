
import java.util.List;

public class Bodega implements Inventario{
    private List<Producto> productos;

    @Override
    public ActorIterator crearIteratorWeb(){
        ActorIterator compradorWebIterator = new CompradorWebIterator(this);
        return compradorWebIterator;
    }

    @Override
    public ActorIterator crearIteratorVendedor() {
        ActorIterator vendedorIterator = new VendedorIterator(this);
        return vendedorIterator;
    }

    @Override
    public ActorIterator crearIteratorProveedor() {
        ActorIterator proveedorIterator = new ProveedorIterator(this);
        return proveedorIterator;
    }

    @Override
    public ActorIterator crearIteratorMantenimiento() {
        ActorIterator mantenimientoIterator = new MantenimientoIterator(this);
        return mantenimientoIterator;
    }

    public List<Producto> getProductos(){
        return this.productos;
    }

}
