public class Main {
    public static void main(String[] args) {
        System.out.println("Phone Zone ----------------------------------------------------------------");
        System.out.println("Phone Zone ----------------------------------------------------------------");
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.turnOn();
        smartPhone.batteryStatus();
        smartPhone.connectToInternet();
        smartPhone.receiveNotification("Bed Time!");
        smartPhone.makeCall("8 777 453 51 01");
        smartPhone.sendSMS("Good Night");
        GadgetGPS.GPS("192.168.101.1:27015");
        smartPhone.turnOff();
        System.out.println("");
        System.out.println("");

        System.out.println("SmartTV Zone ----------------------------------------------------------------");
        System.out.println("SmartTV Zone ----------------------------------------------------------------");

        SmartTV smartTV = new SmartTV();
        smartTV.turnOn();
        smartTV.batteryStatus();
        smartTV.connectToInternet();
        smartTV.receiveNotification("Buy New Smart AI TV!!!");
        smartTV.streamVideo("https://youtu.be/W9MEqApxRvU");
        smartTV.changeChannel(5);
        smartTV.turnOff();
        System.out.println("");
        System.out.println("");


        System.out.println("smartWatch Zone ----------------------------------------------------------------");
        System.out.println("smartWatch Zone ----------------------------------------------------------------");

        SmartWatch smartWatch = new SmartWatch();
        smartWatch.turnOn();
        smartWatch.batteryStatus();
        smartWatch.connectToInternet();
        smartWatch.receiveNotification("1 Notification from Telegram");
        smartWatch.trackHeartRate();
        smartWatch.showTime();
        GadgetGPS.GPS("192.168.1.0:27325");
        smartWatch.turnOff();
        System.out.println("");
        System.out.println("");


        smartPhone.connectToDevice(smartTV);
        smartWatch.connectToDevice(smartPhone);
        smartTV.connectToDevice(smartPhone);


    }
}