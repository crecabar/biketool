package cl.rglabs.domain.entities;

import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class User extends AbstractModel{

    private String name;

    private String email;

    private String nickname;

    private Date birthdate;

    private double weight;

    private double height;

    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        Date now = Date.from(Instant.now());
        long difference = now.getTime() - this.birthdate.getTime();
        return (int) (TimeUnit.MILLISECONDS.toDays(difference)/365);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
