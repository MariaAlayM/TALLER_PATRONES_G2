import java.util.List;

public class CompradorWebIterator implements ActorIterator{
    private final Bodega inventarioWeb;
    private int posicion = 0;

    public CompradorWebIterator(Bodega inventarioWeb){
        this.inventarioWeb = inventarioWeb;
    }

    @Override
    public Producto getNext() {
        List<Producto> productos = inventarioWeb.getProductos();
        if(this.hasMore()){
            Producto producto = productos.get(posicion);
            posicion++;
            return producto;
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        List<Producto> productos = inventarioWeb.getProductos();
        return posicion < productos.size();
    }
}
