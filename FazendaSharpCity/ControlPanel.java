package FazendaSharpCity;

public class ControlPanel {
    private Sensor humiditySensor;
    private Sensor temperatureSensor;

    public ControlPanel() {
        SensorFactory factory = new SensorFactory(); // Aqui usamos a SensorFactory
        this.humiditySensor = factory.createSensor("humidity");
        this.temperatureSensor = factory.createSensor("temperature");
    }

    public void displayData() {
        humiditySensor.readData();
        temperatureSensor.readData();
    }
}
