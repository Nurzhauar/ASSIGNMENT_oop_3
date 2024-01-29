public class SmartPhone extends Gadget {
    @Override
    public void receiveNotification(String message) {
        System.out.println("SmartPhone Notification: " + message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("SmartPhone Battery Status: 58%");
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + " from SmartPhone.");
    }

    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message + " from SmartPhone.");
    }

    public void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartPhone is connected to " + anotherDevice.getClass().toString());
    }
}