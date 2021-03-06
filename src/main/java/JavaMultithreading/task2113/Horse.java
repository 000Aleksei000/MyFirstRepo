package JavaMultithreading.task2113;

public class Horse {
    private String name;
    private double speed;
    private double distance;
    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void move(){
        distance += speed*Math.random();
    }
    public void print(){
        int dist = (int) distance;
        for(int i = 0; i<dist; i++){
            System.out.print(".");
            if(i==dist-1){
                System.out.print(name);
            }
        }
    }
}
