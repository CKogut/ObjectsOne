package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Person person1 = new Person("Joe", 41, 177);

        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        logger.info(String.valueOf(person1.getHeight()));
    }
}
