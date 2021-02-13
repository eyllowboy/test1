package Task2;

import java.util.Comparator;

public class SortRecruts implements Comparator<Recruit> {
    @Override
    public int compare(Recruit o1, Recruit o2){
        return o1.getLastName().compareTo(o2.getLastName());
    };
}
