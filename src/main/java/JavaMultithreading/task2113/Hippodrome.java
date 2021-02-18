package JavaMultithreading.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> list){
        horses = list;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run(){
        for(int i = 0; i<100; i++){
            try {
                Thread.sleep(800);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            move();
            print();
        }
    }
    public void print(){
        for(Horse horse : horses){
            horse.print();
            System.out.println();
        }
        for(int i = 0 ; i<1; i++){
            System.out.println();
            System.out.println();

        }
    }
    public void move(){
        for(Horse horse : horses){
            horse.move();
        }
    }


    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Jacob", 3, 0));
        horses.add(new Horse("Graf", 3, 0));
        horses.add(new Horse("Wait", 3, 0));
        game = new Hippodrome(horses);
        game.run();
    }
}
