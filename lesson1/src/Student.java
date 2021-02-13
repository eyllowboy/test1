public class Student {
    StringBuilder name;
    int course;
    int grade;

    void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    StringBuilder getName() {
        return name;
    }

    void setGrade(int grade) {
        if (grade > 0 && grade < 11) {
            this.grade = grade;
        }
    }

    int getGrade() {
        return grade;
    }

    void setCourse(int course) {
        if (course > 0 && course < 5) {
            this.course = course;
        }
    }

    int getCourse() {
        return course;
    }

    void showInfo() {
        System.out.println(name + " " + course + " " + grade);
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student st= new Student();
        st.setName(new StringBuilder("Koly"));
        System.out.println(st.getName());
        st.setCourse(3);
        System.out.println(st.getCourse());
        st.setGrade(7);
        System.out.println(st.getGrade());
        st.showInfo();
    }
}