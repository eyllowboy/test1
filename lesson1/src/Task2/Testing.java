package Task2;



public class Testing {
    static RecrutsGenerator generator = new RecrutsGenerator();
    static int good = 0;
    static int neGood = 0;

    public static void main(String[] args) {
        Comission comissia = new Comission(new Dentist(), new Surgeon(), new Oculist(), new Psychiatrist(), new Therapist());
        ArrayRecruites recruitesValid = new ArrayRecruites();
        ArrayRecruites recruitesInvalid = new ArrayRecruites();


        ArrayRecruites recruitesAll = new ArrayRecruites();
        for (int i = 0; i < 1000; i++) {
            recruitesAll.add(generator.madeRecruit());
        }

        for (int i = 0; i < recruitesAll.size(); i++) {
            comissia.test(recruitesAll.recruits[i]);
            if (recruitesAll.recruits[i].isValid()) {
                recruitesValid.add(recruitesAll.recruits[i]);
                good++;
            } else {
                recruitesInvalid.add(recruitesAll.recruits[i]);
                neGood++;
            }
        }
        recruitesValid.sort(new SortRecruts());

        System.out.println("Годных бойцов " + good);
        for (Recruit rec : recruitesValid.recruits) {
            System.out.println(rec);
        }
        System.out.println("Не годных бойцов " + neGood);
        for (Recruit rec : recruitesInvalid.recruits) {
            System.out.println(rec);
        }

         
    }
}
