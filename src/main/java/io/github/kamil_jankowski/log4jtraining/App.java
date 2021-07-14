package io.github.kamil_jankowski.log4jtraining;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        LOGGER.trace("Trace just greeted the user!");
        LOGGER.debug("Debug just greeted the user!");
        LOGGER.info("Info just greeted the user!");
        LOGGER.warn("Warn just greeted the user!");
        LOGGER.error("Error just greeted the user!");
        LOGGER.fatal("Fatal just greeted the user!");
    }
}
