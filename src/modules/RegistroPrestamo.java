
package modules;

import java.util.Date;
import modules.interfacesmodules.ILibro;

public class RegistroPrestamo extends Registro{
    private String idUsuario;
    private Date fechaPrestamo;
    private Date fechaDevolucionEsperada;

    public RegistroPrestamo(String idUsuario, Date fechaPrestamo, Date fechaDevolucionEsperada, String idRegistro, ILibro libro) {
        super(idRegistro, libro);
        this.idUsuario = idUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucionEsperada() {
        return fechaDevolucionEsperada;
    }

    public void setFechaDevolucionEsperada(Date fechaDevolucionEsperada) {
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
    }

    @Override
    public void actualizarEstado() {
        this.libro.setIsDisponible(false);
    }

    
}