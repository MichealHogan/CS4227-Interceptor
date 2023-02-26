package headfirst.designpatterns.observer.weather;

import java.util.logging.Logger;

public class LoggingInterceptor implements Interceptor{
    public void intercept(ContextObject contextObject){
        System.out.println("Logging Interceptor successfully intercepted request from client: \n" + contextObject.getWeatherStats());
    }
}
