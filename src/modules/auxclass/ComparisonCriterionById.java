
package modules.auxclass;

import java.util.Comparator;
import modules.interfacesmodules.IBook;

public class ComparisonCriterionById implements Comparator <IBook>{
    @Override
    public int compare(IBook o1, IBook o2) {
        return o1.getIdBook().compareTo(o2.getIdBook());
    }
}