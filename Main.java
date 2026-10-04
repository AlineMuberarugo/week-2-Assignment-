
public class Main {

    public static void main(String[] args) {

        Student undergraduate = new UndergraduateStudent(3.8);
        Student graduate = new GraduateStudent(20, 6000);

        System.out.println("Undergraduate stipend: $"
                + undergraduate.calculateMonthlyStipend());

        System.out.println("Graduate stipend: $"
                + graduate.calculateMonthlyStipend());
    }
}