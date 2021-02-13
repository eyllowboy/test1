package Task2;

import java.util.Random;

public class RecrutsGenerator {
    private Random random = new Random();
    static int id=0;
    private String[] firstName = {"Михаил", "Петр", "Иван", "Владимир", "Александр", "Дмитрий", "Павел", "Сергей", "Анатолий",};
    private String[] middleName = {"Михаилович", "Петрович", "Иванович", "Владимирович", "Александрович", "Дмитриевич", "Павелич", "Сергеевич", "Анатольевич",};
    private String[] lastName = {"Галкин", "Орлов", "Воробьев", "Уткин", "Курочкин", "Голубев", "Синичкин", "Соловьев", "Журавлев",};

    Recruit madeRecruit() {
        return new Recruit(
                id++,
                firstName[random.nextInt(firstName.length)],
                middleName[random.nextInt(middleName.length)],
                lastName[random.nextInt(lastName.length)],
                (0.2 + Math.random()),
                random.nextBoolean(),
                random.nextBoolean(),
                (int) (Math.random() * 4),
                50 + Math.random() * 40);
    }
}