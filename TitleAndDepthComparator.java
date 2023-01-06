
/**
 * Write a description of TitleAndDepthComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class TitleAndDepthComparator implements Comparator<QuakeEntry> {
    
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        
        int x = q1.getInfo().compareTo(q2.getInfo());
        if (x == 0) {
            double q1d = q1.getDepth();
            double q2d = q2.getDepth();
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
