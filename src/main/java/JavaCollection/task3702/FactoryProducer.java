package JavaCollection.task3702;

import JavaCollection.task3702.female.FemaleFactory;
import JavaCollection.task3702.male.MaleFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(HumanFactoryType humanFactoryType){
        switch (humanFactoryType){
            case FEMALE:
                return new FemaleFactory();
            case MALE:
                return new MaleFactory();
            default: return null;
        }
    }



        public static enum HumanFactoryType{
        FEMALE, MALE,
        }
}
