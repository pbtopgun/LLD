package DesignPattern.StrategyPattern;

public class RouteCalculatorFactory {
    public static RouteCalculator getInstance(String mode){
        if(mode == "car") {
            return new CarRouteCalculator();
        } else if(mode == "bike") {
            return new BikeRouteCalculator();
        } else if(mode == "bus") {
            return new BusRouteCalculator();
        } else if(mode == "metro") {
            return new MetroRouteCalculator();
        }
        //return null;
        return new CarRouteCalculator();
    }
}
