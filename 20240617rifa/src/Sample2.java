public class Sample2 {
    public static void main(String[] args){
        //8時間越えを残業とみなす
        double overWorkingHours1 = EmployeePrac.calculateOverWorkingHours(6);
        System.out.println(overWorkingHours1);
        EmployeePrac e = new EmployeePrac();
        System.out.println(e.getPayment(10));
    }
}
class EmployeePrac{
    int paymentPerHour = 1000;
    public static int STANDARD_WORKING_HOURS = 8;
    public static double OVER_PAY_RATIO = 1.5;
    public double getPayment(int workingHours){
        double overWorkingHours = calculateOverWorkingHours(workingHours);
        double paymentForOverWorkingHours = this.paymentPerHour * OVER_PAY_RATIO * overWorkingHours;
        double standardWorkingHours = workingHours - overWorkingHours;
        double paymentForStandardWorkHours = this.paymentPerHour * standardWorkingHours;
        return paymentForStandardWorkHours + paymentForOverWorkingHours;
    }
    public static double calculateOverWorkingHours(double workingHours){
        if(workingHours < STANDARD_WORKING_HOURS) {
            return 0;
        }else{
            return workingHours - STANDARD_WORKING_HOURS;
        }
    }
}