
package modules.auxclass;

import java.util.Comparator;
import modules.interfacesmodules.ILibro;

public class CriterioComparacionByAutor implements Comparator <ILibro>{
    @Override
    public int compare(ILibro o1, ILibro o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}
