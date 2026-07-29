public abstract class AprobadorBaseHandler implements AprobacionCambioHandler {
    private AprobacionCambioHandler siguiente;

    @Override
    public void establecerSiguiente(AprobacionCambioHandler h) {
        this.siguiente = h;
    }

    @Override
    public void procesarSolicitud(SolicitudCambio s) {
        if (siguiente != null) {
            siguiente.procesarSolicitud(s);
        }
    }
}