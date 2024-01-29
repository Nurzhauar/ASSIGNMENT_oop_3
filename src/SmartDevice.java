public interface SmartDevice {
    void turnOn();
    void turnOff();
    void connectToInternet();

    static void GPS(String message) {}
}
