public class Simulator {
    public static void main(String[] args){
        SolarSystem ss = new SolarSystem();
        ss.addSun(new Sun("5000", "10", "0", "0",));
        ss.addPlanet(new Planet("19.5", "2", "0", "0", "0", "0", "Mercury"));
        ss.addPlanet(new Planet("29.5", "4", "0", "0", "0", "0", "Earth"));
        ss.showPlanets();
    }
}
