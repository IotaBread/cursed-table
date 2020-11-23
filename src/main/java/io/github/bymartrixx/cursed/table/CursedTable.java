package io.github.bymartrixx.cursed.table;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CursedTable implements ModInitializer {
    public static final String MOD_NAME = "Cursed Table";
    public static final String VERSION = "1.1.0";

    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        log (Level.INFO, "Initialized {} version {}", MOD_NAME, VERSION);
    }

    public static void log(Level level, String message, Object ... fields) {
        LOGGER.log(level, message, fields);
    }
}