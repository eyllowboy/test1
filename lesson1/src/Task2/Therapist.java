package Task2;

public class Therapist {
    void test(Recruit recruit) {
        if (recruit.getCardiogram() <80 && recruit.getCardiogram() >60) {

        } else {
            recruit.setDiagnosis("Плохое сердце");
            recruit.setValid(false);
        }
    }
}
