package conversorTemperatura;

public class Cliente {
    private TemperaturaFahrenheit temperatura;

    public Cliente(TemperaturaFahrenheit temperatura) {
        this.temperatura = temperatura;
    }

    public void displayTempertatura(){
       System.out.println("Temperatura em Fahrenheit: " +temperatura.getTemperatura());
    }
}
