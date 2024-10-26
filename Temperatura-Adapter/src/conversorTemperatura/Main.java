package conversorTemperatura;

public class Main {
    public static void main(String[] args) {
        TemperaturaCelsius tempCelsius = new TemperaturaCelsius(25.0);
        System.out.println("Temperatura fornecida em Celsius = " + tempCelsius.getTemperatura());
        TemperaturaFahrenheit tempFahrenheit = new TemperaturaAdapter(tempCelsius);
        Cliente cliente = new Cliente(tempFahrenheit);
        cliente.displayTempertatura();
    }
}
