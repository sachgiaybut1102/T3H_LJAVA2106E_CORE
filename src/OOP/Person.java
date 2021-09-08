package OOP;

public class Person {
    //Properties
    protected String fullName;
    protected String dateOfBirth;
    protected boolean gender;
    protected String placeOfBirth;
    protected String address;
    protected String phoneNumber;
    protected String email;
    protected String cardID;
    protected boolean isMarried;

    //Contructor
    public Person() {

    }

    public Person(String fullName, String dateOfBirth, boolean gender,
                  String placeOfBirth, String address, String phoneNumber,
                  String email, String cardID, boolean isMarried) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.placeOfBirth = placeOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isMarried = isMarried;
        this.cardID = cardID;
    }

    //Method
    //Getter and Setter
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void showProfile() {
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
        System.out.println("Place of birth: " + placeOfBirth);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("EMail: " + email);
        System.out.println("Is Married: " + (isMarried ? "Married" : "Single"));
    }

//Decontructor -- auto
}
