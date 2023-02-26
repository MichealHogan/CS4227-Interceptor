package headfirst.designpatterns.observer.weather;

public class ContextObject {
    WeatherData weatherdata;

    //Initialized with the relevant data
    public ContextObject(WeatherData weatherdata){
        this.weatherdata = weatherdata;
    }

    //API accessor method
    public String getWeatherStats(){
        return  "Pressure: " + weatherdata.getPressure() + "\n" +
                "Humidity: " + weatherdata.getTemperature() + "\n" +
                "Temperature: " + weatherdata.getTemperature();
    }
}


