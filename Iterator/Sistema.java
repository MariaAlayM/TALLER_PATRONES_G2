import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        Bodega bodega = new Bodega(productos);
        ActorIterator personalMantenimiento = bodega.crearIteratorMantenimiento();
        Producto producto1 = personalMantenimiento.getNext();
        Producto producto2 = personalMantenimiento.getNext();
        Producto producto3 = personalMantenimiento.getNext();
        // ... y asi es sucesivamente para el resto de iteradores 
    }
}
