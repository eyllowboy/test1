package Task2;

public class Comission {
    Dentist dantist;
    Surgeon hirurg;
    Oculist okulist;
    Psychiatrist psihiatr;
    Therapist terapevt;

    public Comission(Dentist dantist, Surgeon hirurg, Oculist okulist, Psychiatrist psihiatr, Therapist terapevt) {
        this.dantist = dantist;
        this.hirurg = hirurg;
        this.okulist = okulist;
        this.psihiatr = psihiatr;
        this.terapevt = terapevt;
    }

    void test(Recruit recruit){
        dantist.test(recruit);
        hirurg.test(recruit);
        okulist.test(recruit);
        psihiatr.test(recruit);
        terapevt.test(recruit);

    }
}
