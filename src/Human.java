public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Integer yearOfBirth;
    Phone phone;

    public Human(String firstName, String lastName, Integer yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    void setPet(Animal pet) {
        this.pet = pet;
    }

    void setPhone(Phone phone) {
        this.phone = phone;
    }
}
