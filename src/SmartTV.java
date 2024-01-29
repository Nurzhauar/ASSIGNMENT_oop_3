public class SmartTV extends Gadget {
    @Override
    public void receiveNotification(String message) {
        System.out.println("SmartTV Notification: " + message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("SmartTV doesn't have a battery.");
    }

    // Specific methods for SmartTV
    public void streamVideo(String url) {
        System.out.println("Streaming video from URL: " + url + " on SmartTV.");
    }

    public void changeChannel(int channel) {
        System.out.println("Changing channel to " + channel + " on SmartTV.");
    }
    public void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartTV is connected to " +  anotherDevice.getClass().toString());
    }
}