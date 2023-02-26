package headfirst.designpatterns.observer.weather;

public class WeatherStation {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		weatherData.setMeasurements(80, 65, 30.4f);

		//Test
		Dispatcher dispatcher = new Dispatcher();
		LoggingInterceptor logger = new LoggingInterceptor();
		ContextObject contextObject = new ContextObject(weatherData);

		dispatcher.attach(logger);
		dispatcher.dispatch(contextObject);
	}
}
