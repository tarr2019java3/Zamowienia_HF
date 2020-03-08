import Zamowienia.EmailException;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer() {
    }

    public Customer(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }
    public void setEmail1(String email) throws EmailException {
        if (!this.checkEmail(email)) {
            throw new EmailException("Niepoprawny email");
        }else {this.email = email;
        }
    }
    public boolean checkEmail(String email){
        return email.contains("@");
    }
}
