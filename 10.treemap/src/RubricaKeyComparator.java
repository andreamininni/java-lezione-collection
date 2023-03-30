import java.util.Comparator;
public class RubricaKeyComparator implements Comparator<RubricaKey> {
    @Override
    public int compare(RubricaKey r1, RubricaKey r2){
        return r1.progressivo - r2.progressivo;
    }
}
