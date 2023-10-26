package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("Joe", 41, 177);
        logger.info(String.valueOf(person1.getHeight()));

        //Creating an array of chairs
        Chair[] chairs = new Chair[5];

        //Creating a set of chairs
        Chair chair1 = new Chair("Wool", "Blue", 4);
        Chair chair2 = new Chair("Plastic", "White", 3);
        Chair chair3 = new Chair("Leather", "Purple", 4);

        //Assigning to the array
        chairs[0] = chair1;
        chairs[1] = chair2;
        chairs[2] = chair3;

        //Creating and assigning the best chair from the array
        Chair comfyChair = chairs[2];

        //Logging the value of material of comfyChair, expecting value to be "leather"
        logger.info(comfyChair.getMaterial());
    }
}
