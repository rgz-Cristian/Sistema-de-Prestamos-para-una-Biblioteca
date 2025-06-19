
package modules;

import java.util.Date;
import modules.interfacesmodules.ILibro;

public class RegistroDevolucion extends Registro{
    private Date fechaDevolucion;

    public RegistroDevolucion(Date fechaDevolucion, String idRegistro, ILibro libro) {
        super(idRegistro, libro);
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    @Override
    public void actualizarEstado() {
        this.libro.setIsDisponible(true);
    }
}
