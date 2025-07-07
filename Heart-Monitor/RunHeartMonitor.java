public class RunHeartMonitor {
    public static void main(String[] args){
//Create user(s)
        Users user = new Users(1, "User Name", "user@example.com");

        //Collect raw ECG data
        RawData rawData = new RawData(); //Create new object file
        rawData.addSamples(0.1);
        rawData.addSamples(0.3);
        rawData.addSamples(0.5);

        //Add processed data here

        ProcessedData processedData = new ProcessedData(72, 45.5);

        //Add Event logs

        EventLogs eventLogs = new EventLogs();
        eventLogs.addEvent("2025-07-03T10:30 OOZ - Normal heart rate");
        eventLogs.addEvent("2025-07-07T10:40 OOZ - Tachycardia detected");

        //Add Battery level

        BatteryStatus batteryStatus = new BatteryStatus(86);

        //Add Device logs

        DeviceLogs deviceLogs = new DeviceLogs();
        deviceLogs.addLog("Device initialized");
        deviceLogs.addLog("Sensor reading started");


        System.out.println("User Profile:");
        System.out.println("ID: " + user.getuserprofile());
        System.out.println("Name: " + user.getname());
        System.out.println("Contact: " + user.getcontact());

        System.out.println("\nRaw ECG Samples: " + rawData.getSamples());
        System.out.println("Processed Data: " + processedData.toString());
        System.out.println("Event Logs: " + eventLogs.getEvents());
        System.out.println("Battery Level: " + batteryStatus.getBatterylevel() + "%");
        System.out.println("Device Logs: " + deviceLogs.getLogs());
    }
}
