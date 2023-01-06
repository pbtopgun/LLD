package DesignPattern.StrategyPattern;

public class GoogleMaps {
    String route(String src,String dest, String modeOfTransport) {
        /**
        if(modeOfTransport == "car") {

        }
        if(modeOfTransport == "bike") {

        } */
        return RouteCalculatorFactory.getInstance(modeOfTransport)
        .getRoute(src,dest);
    }
}
