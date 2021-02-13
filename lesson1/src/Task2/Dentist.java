package Task2;

public class Dentist {
    void test(Recruit recruit) {
        if (recruit.getImplantCount()<=1) {

        } else {
            recruit.setDiagnosis("Плохие зубы");
            recruit.setValid(false);
        }
    }
}
