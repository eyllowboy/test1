package Task2;

public class Psychiatrist {
   void  test(Recruit recruit) {
        if (Math.random()>0.5 ) {

        } else {
            recruit.setDiagnosis("Не прошел психиатрическую проверку");
            recruit.setValid(false);
        }
    }
}
