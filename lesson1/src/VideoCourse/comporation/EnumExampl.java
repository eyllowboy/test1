package VideoCourse.comporation;

public class EnumExampl {
    WeakOfdays WeakOfday;

    public EnumExampl(WeakOfdays weakOfday) {
        WeakOfday = weakOfday;
    }

    void daysInfo() {

        switch (WeakOfday) {
            case MONDAY: {
                System.out.println("good");
                break;
            }

            case TUESDAY: {
                System.out.println("good-");
                break;
            }

            case WEDNESDAY: {
                System.out.println("good+");
                break;
            }

        }
    }

    public static void main(String[] args) {
        EnumExampl en = new EnumExampl(WeakOfdays.TUESDAY);
        en.daysInfo();
    }
}

enum WeakOfdays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDADAY;
}