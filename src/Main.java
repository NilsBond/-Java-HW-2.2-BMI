public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(60, 174);
        System.out.println(bmi);
    }
}
//        long bonusBelowLimitForRegistered = service.calculate(true, 1000_60);
//        System.out.println(bonusBelowLimitForRegistered);

//        BmiService service = new BmiService();
//        int weight = 60;
//        int height = 174;
//        int bmi = service.calculate();
