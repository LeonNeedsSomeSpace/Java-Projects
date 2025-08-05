import java.util.ArrayList;
import java.util.List;

public class DeviceLogs {
    private List<String> logs;

    public DeviceLogs() {
        this.logs = new ArrayList<>();
    }

    public void addLog(String log){
        logs.add(log);
    }

    public List<String> getLogs() {
        return logs;
    }
}
