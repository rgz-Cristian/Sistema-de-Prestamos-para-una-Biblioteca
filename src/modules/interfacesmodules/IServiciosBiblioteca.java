
package modules.interfacesmodules;

import modules.Registro;

public interface IServiciosBiblioteca {
    void registrarLibro(ILibro libro);
    void addRegistro(Registro registroPrestamo);
    ILibro buscarPorTitulo(String titulo);
    ILibro buscarPorAutor(String autor);
}
