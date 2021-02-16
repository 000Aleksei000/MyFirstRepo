package JavaCollection.task35.task3702.male;


import JavaCollection.task35.task3702.AbstractFactory;
import JavaCollection.task35.task3702.Human;

public class MaleFactory implements AbstractFactory {
    public Human getPerson(int age){
        if(age<=KidBoy.MAX_AGE){
            return new KidBoy();
        }
        else if(age<=TeenBoy.MAX_AGE){
            return new TeenBoy();
        }
        else
            return new Man();
    }
}
