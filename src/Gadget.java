public abstract class Gadget implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Device is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Device is turned off.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Device is connected to the internet.");
    }
    public abstract void receiveNotification(String message);
    public abstract void batteryStatus();
}