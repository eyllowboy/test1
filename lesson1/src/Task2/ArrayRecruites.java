package Task2;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayRecruites {

    public ArrayRecruites() {
        this.recruits = new Recruit[0];
    }

    public ArrayRecruites(int a) {
        this.recruits = new Recruit[a];
    }

    Recruit[] recruits;


    int size() {
        return recruits.length;
    }

    Recruit get(int index) {
        return recruits[index];
    }

    void set(int index, Recruit recruit) {
        try {
            recruits[index] = recruit;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void add(Recruit recruit) {
        Recruit[] newRecruits = new Recruit[recruits.length + 1];
        System.arraycopy(recruits, 0, newRecruits, 0, recruits.length);
        newRecruits[newRecruits.length - 1] = recruit;
        recruits = newRecruits;
    }

    void sort(Comparator<Recruit> comparator) {
        Arrays.sort(recruits, new SortRecruts());
    }
}
