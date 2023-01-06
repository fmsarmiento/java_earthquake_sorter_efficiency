
/**
 * Write a description of TitleLastAndMagnitudeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
    
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String q1s = q1.getInfo().substring(q1.getInfo().lastIndexOf(" ")+1);
        String q2s = q2.getInfo().substring(q2.getInfo().lastIndexOf(" ")+1);
        int x = q1s.compareTo(q2s);
        if (x == 0) {
            double q1d = q1.getMagnitude();
            double q2d = q2.getMagnitude();
            if (q1d > q2d) {
                return 1;
            }
            else if (q1d < q2d) {
                return -1;
            }
            else {
                return 0;
            }
        }
        return x;
    }
}
