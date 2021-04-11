public class BmiService {
    public float calculate(float weight, float height) {
        double bmi = weight / Math.pow(height / 100, 2);
        return (float) bmi;
    }
}
