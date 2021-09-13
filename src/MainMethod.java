public class MainMethod {
    public static void main(String[] agrs) {
        int dateOfBirth = getDateOfBirh(21);
        System.out.println("You were born in " + dateOfBirth);
        getAge(21);
    }

    static int getDateOfBirh(int age) {
        return 2021 - age;
    }

    static void getAge(int age) {
        System.out.println("You is " + age);
    }

    static void sayHello(String fName, int age) {
        System.out.println("Hello, " + fName + " you are " + age + "?");
    }

    static void sayHello(String fName) {
        System.out.println("Hello, " + fName);
    }
}
