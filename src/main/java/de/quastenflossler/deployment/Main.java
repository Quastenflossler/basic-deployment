package de.quastenflossler.deployment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.debug("Your awesome!");

        Random random = new Random();
        int randomValue = random.nextInt(100);
        LOGGER.info("The answer to everything is {}", randomValue);

        LOGGER.debug("Over and out...");
    }
}
