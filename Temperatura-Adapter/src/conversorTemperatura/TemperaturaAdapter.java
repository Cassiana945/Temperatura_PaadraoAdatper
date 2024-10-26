package conversorTemperatura;

public class TemperaturaAdapter implements TemperaturaFahrenheit {

    private TemperaturaCelsius tempCelsius;

    public TemperaturaAdapter(TemperaturaCelsius tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    @Override
    public double getTemperatura() {
        return tempCelsius.getTemperatura() * 9/5 + 32;
    }
}
