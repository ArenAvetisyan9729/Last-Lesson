package Homework.Fifth;

public class Author {

    private String name;
    private String surname;
    private String dateOfBirth;
    private String dateOfDeath;

    public Author(String name, String surname, String dateOfBirth, String dateOfDeath) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + dateOfBirth + " - " + (dateOfDeath != null ? dateOfDeath : "Present") + ")";
    }
}
