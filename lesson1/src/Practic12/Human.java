package Practic12;

public class Human {
    String family;
    String name;
    String otchestvo;
    String dataBirth;
    int phoneNumber;
    String city;
    String country;
    String homeAdress;


    public void fio(String family, String name, String otchestvo) {
        this.family = family;
        this.name = name;
        this.otchestvo = otchestvo;
    }

    public void data(String dataBirth, int phoneNumber, String city, String country, String homeAdress) {
        this.dataBirth = dataBirth;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.homeAdress = homeAdress;
    }
    public void getFio(){
        System.out.println(family+" "+name+" "+otchestvo);
    }
    public void getData(){
        System.out.println(dataBirth+" "+phoneNumber+" "+city+" "+country+" "+" "+homeAdress);
    }
}