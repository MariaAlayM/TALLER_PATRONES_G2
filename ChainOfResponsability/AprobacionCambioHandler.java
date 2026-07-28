public interface AprobacionCambioHandler {
    void establecerSiguiente(AprobacionCambioHandler h);
    void procesarSolicitud(SolicitudCambio s);
}