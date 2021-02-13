package Task2;

public class Surgeon {
    void test(Recruit recruit) {
        if (!recruit.isFlatFeet()) {

        } else {
            recruit.setDiagnosis("Плоскостопие");
            recruit.setValid(false);
        }
    }
}
