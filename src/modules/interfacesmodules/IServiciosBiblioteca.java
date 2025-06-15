
package modules.interfacesmodules;

import modules.Registro;

public interface IServiciosBiblioteca {
    void registrarLibro(ILibro libro);
    void addRegistro(Registro registro);
    ILibro buscarPorTitulo(String titulo);
    ILibro buscarPorAutor(String autor);
}
