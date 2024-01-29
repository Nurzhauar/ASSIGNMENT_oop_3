public class SmartWatch extends Gadget {
    @Override
    public void receiveNotification(String message) {
        System.out.println("SmartWatch Notification: " + message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("SmartWatch Battery Status: 72%");
    }

    // Specific methods for SmartWatch
    public void trackHeartRate() {
        System.out.println("Tracking Heart Rate on SmartWatch.");
    }

    public void showTime() {
        System.out.println("Displaying Time on SmartWatch.");
    }

    public void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartWatch is connected to " +  anotherDevice.getClass().toString() );
    }
}
