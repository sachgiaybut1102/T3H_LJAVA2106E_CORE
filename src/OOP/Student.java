package OOP;

public class Student extends Person {
    private String course;
    private float point;

    public Student(String fullName, String dateOfBirth, boolean gender,
                   String placeOfBirth, String address, String phoneNumber,
                   String email, String cardID, boolean isMarried, String course, float point) {
        super(fullName,dateOfBirth,gender,placeOfBirth,address,phoneNumber,email,cardID,isMarried);
        this.course = course;
        this.point = point;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public void showProfile() {
        super.showProfile();
        System.out.println("Course: " + course);
        System.out.println("Point: " + point);
    }
}
