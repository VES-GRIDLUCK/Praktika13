
import java.time.LocalDate;

public class Human {
    private String fio;
    private LocalDate birthday;
    private String telephone;
    private String city;
    private String country;
    private String address;
    public Human(){
        this.fio = "Ivanov Ivan Ivanovich";
        this.birthday = LocalDate.of(2006, 10, 02);
        this.telephone = "89209999999" ;
        this.city = "Ryazan";
        this.country = "Russia";
        this.address = "s. Polonski, h. 10, r. 10";
    }
    public Human(String fio, LocalDate birthday, String telephone, String city, String country, String address){
        this.fio = fio;
        this.birthday = birthday;
        this.telephone = telephone;
        this.city = city;
        this.country = country;
        this.address = address;
    }
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        if (telephone.charAt(0) == '8' && telephone.length() == 11) this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


