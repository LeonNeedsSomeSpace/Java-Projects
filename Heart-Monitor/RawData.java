import java.util.List;
import java.util.ArrayList;

public class RawData {
    private List<Double> ecgVoltSamples; //Hold the ECG voltage samples

    public RawData(){ //Define a constructor for RawData object
        this.ecgVoltSamples = new ArrayList<>(); //Initialize 'ecgVoltSamples' as an ArrayList to collect samples
    }
    public void addSamples(double sample){
        ecgVoltSamples.add(sample); //Adds samples to the list
    }
    public List<Double> getSamples(){
        return ecgVoltSamples;
        //Gives access to the stored data without modifying the list directly
    }
}
