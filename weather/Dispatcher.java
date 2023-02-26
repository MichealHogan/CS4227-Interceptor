package headfirst.designpatterns.observer.weather;

import java.util.ArrayList;

public class Dispatcher {

    ArrayList<Interceptor> interceptors = new ArrayList<Interceptor>();

    public void attach(Interceptor interceptor){
        interceptors.add(interceptor);
    }

    //Passing reference of context object to all concrete Interceptors
    public void dispatch(ContextObject contextObject) {
        for (Interceptor value : interceptors) {
            value.intercept(contextObject);
        }
    }
}
