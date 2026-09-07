package com.amoxicillinmediatek.pluginscan;

import java.util.Locale;
import java.util.Set;

final class PluginScanCommandScanner {
    private static final Set<String> DEFAULT_COMMANDS = Set.of(
        "help", "plugins", "pl", "version", "ver", "me", "tell", "msg", "w", "teammsg",
        "tm", "trigger", "function", "reload", "seed", "datapack", "locate", "time", "weather",
        "gamemode", "give", "tp", "teleport", "kill", "effect", "summon", "say", "execute"
    );

    private PluginScanCommandScanner() {}

    static boolean isVanillaOrDefaultCommand(String command) {
        return command != null && DEFAULT_COMMANDS.contains(command.trim().toLowerCase(Locale.ROOT));
    }
}
