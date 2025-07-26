public class ProcessedData {
    private int HeartRate; //Define an integer that stores the heartrate
    private double HeartRateVariability; //Define a double that stores heartrate variability

    public ProcessedData(int HeartRate, double HRVariability){
        this.HeartRate = HeartRate;
        this.HeartRateVariability = HRVariability;
    }

    public int getHeartRate(){
        return HeartRate;
    }

    public double getHeartRateVariability(){
        return HeartRateVariability;
    }

    @Override
    public String toString(){
        return "Heart Rate: " + HeartRate + " bpm, Heart Rate Variability: " + HeartRateVariability + "ms";
    }
}
