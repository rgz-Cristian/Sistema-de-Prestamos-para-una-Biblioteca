
package modules;

import modules.interfacesmodules.ILibro;


public abstract class Registro {
    protected String idRegistro;
    protected ILibro libro;

    public Registro(String idRegistro, ILibro libro) {
        this.idRegistro = idRegistro;
        this.libro = libro;
    }
    

    public abstract void actualizarEstado();

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public ILibro getLibro() {
        return libro;
    }

    public void setLibro(ILibro libro) {
        this.libro = libro;
    }
 
}
