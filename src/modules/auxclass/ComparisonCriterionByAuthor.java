
package modules.auxclass;

import java.util.Comparator;
import modules.interfacesmodules.ILibro;

public class CriterioComparacionByTitulo implements Comparator <ILibro>{
    @Override
    public int compare(ILibro o1, ILibro o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
