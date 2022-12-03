public class Sun {
    private double radius;
    private double mass;
    private double x;
    private double y;
    private double velX;
    private double velY;
    private String name;

    public Sun(double radius, double mass, double x, double y, double velX, double velY,String name){
        this.radius = radius;
        this.mass = mass;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
        this.name = name;
    }

    public double getPosX(){
        return this.x;
    }
    public double getPosY(){
        return this.y;
    }
    public double getMass(){
        return this.mass;
    }

}


