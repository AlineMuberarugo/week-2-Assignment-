
public class GraduateStudent extends Student {

    private double taHours;
    private double yearlyResearchGrant;

    public GraduateStudent(double taHours, double yearlyResearchGrant) {
        this.taHours = taHours;
        this.yearlyResearchGrant = yearlyResearchGrant;
    }

    @Override
    public double calculateMonthlyStipend() {
        double stipend = 1200;
        stipend = stipend + (taHours * 25);
        stipend = stipend + (yearlyResearchGrant / 12);

        return stipend;
    }
}
