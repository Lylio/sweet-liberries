package com.lylechristine.sweetliberries.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JBasics {

    private static Logger LOGGER = LoggerFactory.getLogger(SLF4JBasics.class);

    public static void main(String[] args) {

        // Basics

        LOGGER.info("This is an info logging message!");

        int value = 42;
        LOGGER.info("This is an example of parameterized logging: the paramter value is {}.", value);

        LOGGER.error("This is an ERROR-level logging message.");

        System.out.println("Debug is enabled: " + LOGGER.isDebugEnabled());

        LOGGER.debug("This is a DEBUG-level message.");
    }
}
