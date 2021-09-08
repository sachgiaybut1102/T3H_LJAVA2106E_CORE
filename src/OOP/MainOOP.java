package OOP;

public class MainOOP {
    public static void main(String[] agrs) {
        Person person = new Person("Ngo Cong Minh", "10-03-1998", true,
                "Hanoi", "Vinh Hung, Hoang Mai, Ha Noi", "0973195313",
                "minhsaothe1102@gmail.com", "034589101", false);

        Person person1 = new Person();

        Student student = new Student("Ngo Cong Minh", "10-03-1998", true,
                "Hanoi", "Vinh Hung, Hoang Mai, Ha Noi", "0973195313",
                "minhsaothe1102@gmail.com", "034589101", false,"Java web fullstack",(float)10.0);

        System.out.println("-----Person profile-----");
        person.showProfile();
        System.out.println("-----Person1 profile-----");
        person1.showProfile();
        System.out.println("-----Student profile-----");
        student.showProfile();

        //Áp dụng tính chất của hướng đối tượng, ta có thể gán Student là cho đối tượng Person
        //Ví dụ
        Person person2 = student;

        System.out.println("-----Person2 profile-----");
        person2.showProfile();
        //theo các bạn person2 sẽ hiện showProfile như nào?
    }
}
