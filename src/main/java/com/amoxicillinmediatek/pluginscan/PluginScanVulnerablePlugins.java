package com.amoxicillinmediatek.pluginscan;

import java.util.Locale;
import java.util.Set;

final class PluginScanVulnerablePlugins {
    private static final Set<String> KNOWN = Set.of("nocheatplus", "vulcan", "spartan", "matrix");

    private PluginScanVulnerablePlugins() {}

    static Set<String> keys() {
        return KNOWN;
    }

    static String normalizeKey(String value) {
        return value == null ? "" : value.trim().toLowerCase(Locale.ROOT).replace(" ", "");
    }
}
