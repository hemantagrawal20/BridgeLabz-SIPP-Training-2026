class Device {
    int deviceId;
    String status;

    Device(int deviceId,
           String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {

    int temperatureSetting;

    Thermostat(int id,
               String status,
               int temp) {

        super(id, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println(
                deviceId +
                " " +
                status +
                " Temp:" +
                temperatureSetting);
    }
}