public class Sistema {
    public static void main(String[] args) {
        AprobacionCambioHandler h1 = new AtencionUsuarioHandler();
        AprobacionCambioHandler h2 = new TecnicoHandler();
        AprobacionCambioHandler h3 = new InventarioHandler();
        AprobacionCambioHandler h4 = new GerenteHandler();

        h1.establecerSiguiente(h2);
        h2.establecerSiguiente(h3);
        h3.establecerSiguiente(h4);

        SolicitudCambio s = new SolicitudCambio();
        
        h1.procesarSolicitud(s);
    }
}
