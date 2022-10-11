package FunctionalPrograms_Day5Problems;

public class WindChill {
    public static void main(String[] args){
        double t=Double.parseDouble(args[0]);//Temperature in Fahrenheit
        double v=Double.parseDouble(args[1]);//wind speed in mph
        double w=35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature : "+t);
        System.out.println("Wind Speed : "+v);
        System.out.println("Wind Chill : "+w);
    }
}
