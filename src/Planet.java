public class Planet {
    private double radius;
    private double mass;
    private double x;
    private double y;
    private double velX;
    private double velY;
    private String name;

    public Planet(double radius, double mass, double x, double y, double velX, double velY,String name){
        this.radius = radius;
        this.mass = mass;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
        this.name = name;
    }
    public void moveTo(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }
    public void setVelX(double newVelX) {
        this.velX = newVelX;
    }
    public void setVelY(double newVelY){
        this.velY = newVelY;
    }
    public void move(double newX, double newY){ this.x = newX; this.y = newY;}
    public double getPosX(){
      return this.x;
    }
    public double getPosY(){
        return this.y;
    }
    public double getMass(){
        return this.mass;
    }
    public String toString() {
        return String.format("&s's x:%f&n%s's y:%f", this.name, this.x,this.name,this.y);
    }
}
