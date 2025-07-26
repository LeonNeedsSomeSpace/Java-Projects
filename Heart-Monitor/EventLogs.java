import java.util.ArrayList;
import java.util.List;

public class EventLogs {
    private List<String> events;
    public EventLogs () {
        this.events = new ArrayList<>();

    }
    public void addEvent(String event){
        events.add(event);
    }
    public List<String> getEvents(){
        return events;
    }
}
