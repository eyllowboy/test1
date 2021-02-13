package Task2;

public class Recruit {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private  boolean valid=true;
    private String diagnosis=" ";
    private double visionCoeff;
    private boolean flatFeet;
    private boolean fracture;
    private int implantCount;
    private double cardiogram;

    public Recruit(int id, String firstName, String middleName, String lastName, double visionCoeff, boolean flatFeet, boolean fracture, int implantCount, double cardiogram) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.visionCoeff = visionCoeff;
        this.flatFeet = flatFeet;
        this.fracture = fracture;
        this.implantCount = implantCount;
        this.cardiogram = cardiogram;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid &= valid;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis +=", "+diagnosis;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public void setVisionCoeff(double visionCoeff) {
        this.visionCoeff = visionCoeff;
    }

    public boolean isFlatFeet() {
        return flatFeet;
    }

    public void setFlatFeet(boolean flatFeet) {
        this.flatFeet = flatFeet;
    }

    public boolean isFracture() {
        return fracture;
    }

    public void setFracture(boolean fracture) {
        this.fracture = fracture;
    }

    public int getImplantCount() {
        return implantCount;
    }

    public void setImplantCount(int implantCount) {
        this.implantCount = implantCount;
    }

    public double getCardiogram() {
        return cardiogram;
    }

    public void setCardiogram(int cardiogram) {
        this.cardiogram = cardiogram;
    }

    @Override
    public String toString() {
        return "Призывник{" +
                "id=" + id +
                ", Имя='" + firstName + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Годность=" + valid +
                ", Диагноз='" + diagnosis + '\'' +
                '}';
    }
}
