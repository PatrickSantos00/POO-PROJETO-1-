package FazendaSharpCity;

public class SensorFactory {
    public Sensor createSensor(String type) {
        if (type.equalsIgnoreCase("humidity")) {
            return new HumiditySensor();
        } else if (type.equalsIgnoreCase("temperature")) {
            return new TemperatureSensor();
        } else {
            throw new IllegalArgumentException("Tipo de sensor desconhecido: " + type);
        }
    }
}
