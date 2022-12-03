import java.util.ArrayList;

public class SolarSystem {
    private Sun theSun;
    private ArrayList<Planet> planets;

    public SolarSystem() {
        planets = new ArrayList<>();
    }

    public void addPlanet(Planet p) {
        planets.add(p);
    }

    public void addSun(Sun sun) {
        this.theSun = sun;
    }
    public void showPlanets() {
        for (Planet p : this.planets) {
            System.out.println(p);
        }
    }
    public void movePlanet() {
        double x = 0.0;
        double y = 0.0;
        for (Planet p : this.planets) {
            p.moveTo(x, y);
        }
    }

}

