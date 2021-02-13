package Task2;

public class Oculist {
    void test(Recruit recruit) {
        if (recruit.getVisionCoeff() >= 0.8 && recruit.getVisionCoeff() <= 1.2) {

        } else {
            recruit.setDiagnosis("Плохое зрение");
            recruit.setValid(false);
        }
    }
}
